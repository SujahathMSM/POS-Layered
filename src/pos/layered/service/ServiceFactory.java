/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service;

import pos.layered.dto.CustomerDTO;
import pos.layered.service.custom.impl.CustomerServiceImpl;
import pos.layered.service.custom.impl.ItemServiceImpl;

/**
 *
 * @author sujah\
 * Gonna use singleton pattern
 * There should be only one object of ServiceFactory
 */

public class ServiceFactory {
       private static ServiceFactory sercviceFactory;
       
       private ServiceFactory(){};
       
       public static ServiceFactory getInstance(){
           if (sercviceFactory == null){
               sercviceFactory = new ServiceFactory();
           }
           
           return sercviceFactory;
       }
       
       public SuperService getService(ServiceType type){
           switch (type) {
               case CUSTOMER:
                   return new CustomerServiceImpl();
               case ITEM:
                   return new ItemServiceImpl();
               default:
                   throw null;
           }
       }
       
       public enum ServiceType{
           CUSTOMER,
           ITEM;
       }
}
