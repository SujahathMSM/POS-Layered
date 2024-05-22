/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.service.custom;

import pos.layered.dto.CustomerDTO;
import pos.layered.service.SuperService;

/**
 *
 * @author sujah
 */
public interface CustomerService  extends SuperService{
    String addCustomer(CustomerDTO customerDTO)throws Exception;
    
}
