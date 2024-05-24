/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.entity;

/**
 *
 * @author sujah
 */
public class OrderDetailEntity {
    private String orderId;
    private String itemCode;
    private Integer qty;
    private Double discount;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(String custId, String itemCode, Integer qty, Double discount) {
        this.orderId = custId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.discount = discount;
    }

    /**
     * @return the custId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param custId the custId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" + "custId=" + orderId + ", itemCode=" + itemCode + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
}
