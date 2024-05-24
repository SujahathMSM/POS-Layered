package pos.layered.service.custom.impl;

import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.ItemDao;
import pos.layered.dao.custom.OrderDao;
import pos.layered.dao.custom.OrderDetailDao;
import pos.layered.dto.OrderDTO;
import pos.layered.service.custom.OrderService;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import pos.layered.db.DBConnection;
import pos.layered.dto.OrderDetailDTO;
import pos.layered.entity.ItemEntity;
import pos.layered.entity.OrderDetailEntity;
import pos.layered.entity.OrderEntity;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.Daotypes.ORDER);
    private OrderDetailDao orderDetailDao = (OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.Daotypes.ORDERDETAIL);
    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.Daotypes.ITEM);

    @Override
    public String placeOrder(OrderDTO orderDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(new Date());

            if (orderDao.add(new OrderEntity(orderDTO.getOrderId(), date, orderDTO.getCustomerId()))) {
                boolean isOrderSaved = true;
                for (OrderDetailDTO orderDetailDTO : orderDTO.getOrderDetailDtos()) {
                    if (!orderDetailDao.add(new OrderDetailEntity(
                            orderDTO.getOrderId(),
                            orderDetailDTO.getItemCode(),
                            orderDetailDTO.getQty(),
                            orderDetailDTO.getDiscount()
                    ))) {
                        isOrderSaved = false;
                        break;
                    }
                }

                if (isOrderSaved) {
                    boolean isUpdated = true;
                    for (OrderDetailDTO orderDetailDTO : orderDTO.getOrderDetailDtos()) {
                        ItemEntity entity = itemDao.get(orderDetailDTO.getItemCode());
                        entity.setQuantity(entity.getQuantity() - orderDetailDTO.getQty());
                        if (!itemDao.update(entity)) {
                            isUpdated = false;
                            break;
                        }
                    }

                    if (isUpdated) {
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Failed to update item quantities";
                    }
                } else {
                    connection.rollback();
                    return "Order Detail Save Error";
                }
            } else {
                connection.rollback();
                return "Data Save Error";
            }
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}

