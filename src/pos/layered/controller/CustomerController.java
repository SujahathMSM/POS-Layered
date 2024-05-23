/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.ArrayList;
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

    public ArrayList<CustomerDTO> getAllCustomer() throws Exception {
        return customerService.getAllCustomer();
    }

    public String deleteCustomer(String custID) throws Exception {
        return customerService.deleteCustomer(custID);
    }

    public CustomerDTO SearchCustomer(String custID) throws Exception {
        return customerService.getCustomer(custID);
    }

    public String updateCustomer(CustomerDTO customerDTO) throws Exception {
        return customerService.updateCustomer(customerDTO);
    }
    
}
