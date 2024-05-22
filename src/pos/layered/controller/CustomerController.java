/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import pos.layered.dto.CustomerDTO;
import pos.layered.service.custom.CustomerService;
import pos.layered.service.ServiceFactory;
/**
 *
 * @author sujah
 */
public class CustomerController {
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDTO customerDTO)throws Exception{
        return customerService.addCustomer(customerDTO);
    }
    
}
