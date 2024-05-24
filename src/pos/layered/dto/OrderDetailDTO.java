/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dto;

/**
 *
 * @author sujah
 */
public class OrderDetailDTO {
    private String itemCode;
    private Integer qty;
    private Double discount;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(String itemCode, Integer qty, Double discount) {
        this.itemCode = itemCode;
        this.qty = qty;
        this.discount = discount;
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
        return "OrderDetailDTO{" + "itemCode=" + itemCode + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
    
}
