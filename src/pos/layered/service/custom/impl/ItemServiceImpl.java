/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.ItemDao;
import pos.layered.dto.ItemDTO;
import pos.layered.entity.ItemEntity;
import pos.layered.service.custom.ItemService;

/**
 *
 * @author sujah
 */
public class ItemServiceImpl implements ItemService {

    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.Daotypes.ITEM);

    @Override
    public String addItem(ItemDTO dto) throws Exception {
        if (itemDao.add(new ItemEntity(dto.getItemCode(), dto.getDesc(), dto.getPackSize(), dto.getUnitPrice(), dto.getQuantity()))) {
            return "Successfully Added";
        }

        return "Failed";
    }

    @Override
    public String updateItem(ItemDTO dto) throws Exception {
        if (itemDao.update(new ItemEntity(dto.getItemCode(), dto.getDesc(), dto.getPackSize(), dto.getUnitPrice(), dto.getQuantity()))) {
            return "Successfully updated";
        }

        return "Failed";
    }

    @Override
    public String deleteItem(String id) throws Exception {
        if (itemDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Failed";
        }
    }

    @Override
    public ItemDTO getItem(String id) throws Exception {
        ItemEntity entity = itemDao.get(id);
        return new ItemDTO(
                entity.getItemCode(),
                entity.getDesc(),
                entity.getPackSize(),
                entity.getUnitPrice(),
                entity.getQuantity()
        );
    }

    @Override
    public ArrayList<ItemDTO> getAllItem() throws Exception {
        ArrayList<ItemDTO> itemDTOs = new ArrayList<>();
        ArrayList<ItemEntity> itemEntitys = itemDao.getAll();
        
        for (ItemEntity entity : itemEntitys) {
            ItemDTO itemDTO = new ItemDTO(
                    entity.getItemCode(),
                    entity.getDesc(),
                    entity.getPackSize(),
                    entity.getUnitPrice(),
                    entity.getQuantity()
            );
            
            itemDTOs.add(itemDTO);
        }
        
        return itemDTOs;
    }

}
