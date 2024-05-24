/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dto;

import java.util.List;

/**
 *
 * @author sujah
 */
public class OrderDTO {
    private String orderId;
    private String customerId;
    private List<OrderDetailDTO> orderDetailDtos;

    public OrderDTO() {
    }

    public OrderDTO(String orderId, String customerId, List<OrderDetailDTO> orderDetailDtos) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDetailDtos = orderDetailDtos;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the orderDetailDtos
     */
    public List<OrderDetailDTO> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    /**
     * @param orderDetailDtos the orderDetailDtos to set
     */
    public void setOrderDetailDtos(List<OrderDetailDTO> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }

    @Override
    public String toString() {
        return "OrderDTO{" + "orderId=" + orderId + ", customerId=" + customerId + ", orderDetailDtos=" + orderDetailDtos + '}';
    }
    
    
    
}
