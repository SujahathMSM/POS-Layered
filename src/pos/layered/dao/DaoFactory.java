/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao;

import pos.layered.dao.custom.impl.CustomerDaoImpl;
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
            default:
                return null;
        }
    } 
    
    
    public enum Daotypes{
        CUSTOMER;
    }
}
