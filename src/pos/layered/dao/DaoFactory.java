/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao;

import pos.layered.dao.custom.ItemDao;
import pos.layered.dao.custom.impl.CustomerDaoImpl;
import pos.layered.dao.custom.impl.ItemDaoImpl;
import pos.layered.dao.custom.impl.OrderDaoImpl;
import pos.layered.dao.custom.impl.OrderDetailDaoImpl;
import pos.layered.dto.CustomerDTO;

/**
 *
 * @author sujah
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){};
    
    public static DaoFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DaoFactory();
        }
        
        return daoFactory;
    }
    
    public SuperDao getDao(Daotypes daotype){
        switch(daotype){
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ITEM:
                return new ItemDaoImpl();
            case ORDER:
                return new OrderDaoImpl();
            case ORDERDETAIL:
                return new OrderDetailDaoImpl();
            default:
                return null;
        }
    } 
    
    
    public enum Daotypes{
        CUSTOMER,
        ITEM,
        ORDER,
        ORDERDETAIL;
    }
}
