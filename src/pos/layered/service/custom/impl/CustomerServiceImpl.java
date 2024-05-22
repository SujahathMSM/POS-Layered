/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.CustomerDao;
import pos.layered.dto.CustomerDTO;
import pos.layered.entity.CustomerEntity;
import pos.layered.service.custom.CustomerService;

/**
 *
 * @author sujah
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao CustomerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.Daotypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDTO dto) throws Exception {
        CustomerEntity ce = new CustomerEntity(
                dto.getId(),
                dto.getTitle(),
                dto.getName(),
                dto.getDob(),
                dto.getSalary(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getZip()
        );
        
        if (CustomerDao.add(ce)){
            return "Success";
        }else {
            return "Failed";
        }
    }
    
}
