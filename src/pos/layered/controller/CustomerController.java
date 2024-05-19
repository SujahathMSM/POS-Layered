/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import pos.layered.dto.CustomerDTO;

/**
 *
 * @author sujah
 */
public class CustomerController {
    CustomerService customerService;

    public String saveCustomer(CustomerDTO customerDTO) {
        return customerService.addCustomer(customerDTO);
    }
    
}
