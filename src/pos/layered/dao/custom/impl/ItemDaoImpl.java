/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.CrudUtil;
import pos.layered.dao.custom.ItemDao;
import pos.layered.entity.ItemEntity;
import java.sql.ResultSet;
/**
 *
 * @author sujah
 */
public class ItemDaoImpl implements ItemDao{

    @Override
    public boolean add(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES(?,?,?,?,?)", t.getItemCode(), t.getDesc(), t.getPackSize(), t.getUnitPrice(), t.getQuantity());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE item SET Description=?, PackSize=?,UnitPrice=?,QtyOnHand=? WHERE ItemCode=?",  t.getDesc(), t.getPackSize(), t.getUnitPrice(), t.getQuantity(), t.getItemCode());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE ItemCode=?", id);
    }

    @Override
    public ItemEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item WHERE ItemCode=?", id);
        while (rst.next()){
            ItemEntity itemEntity = new ItemEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5)
            );
            
            return itemEntity;
        }
        return null;
        
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item");
        ArrayList<ItemEntity> itemEntitys = new ArrayList<>();
        
        while(rst.next()){
            ItemEntity itemEntity = new ItemEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5)
            );
            
            itemEntitys.add(itemEntity);
        }
        
        return itemEntitys;
    }
    
}
