/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import pos.layered.dto.CustomerDTO;
import pos.layered.service.custom.CustomerService;

/**
 *
 * @author sujah
 */
public class CustomerController {
    CustomerService customerService = ServiceFactory;

    public String saveCustomer(CustomerDTO customerDTO)throws Exception{
        return customerService.addCustomer(customerDTO);
    }
    
}
