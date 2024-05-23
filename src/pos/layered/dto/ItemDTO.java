/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dto;

/**
 *
 * @author sujah
 */
public class ItemDTO {
    private String itemCode;
    private String Desc;
    private String packSize;
    private double unitPrice;
    private int quantity;

    public ItemDTO() {
    }

    public ItemDTO(String itemCode, String Desc, String packSize, double unitPrice, int quantity) {
        this.itemCode = itemCode;
        this.Desc = Desc;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ItemDTO{" + "itemCode=" + itemCode + ", Desc=" + Desc + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", quantity=" + quantity + '}';
    }
    
    
}
