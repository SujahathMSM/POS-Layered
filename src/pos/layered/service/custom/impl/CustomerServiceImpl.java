// CustomerServiceImpl

package pos.layered.service.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.CustomerDao;
import pos.layered.dto.CustomerDTO;
import pos.layered.entity.CustomerEntity;
import pos.layered.service.custom.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.Daotypes.CUSTOMER);

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
        
        if (customerDao.add(ce)){
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateCustomer(CustomerDTO dto) throws Exception {
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
        
        if (customerDao.update(ce)){
            return "Successfully Updated";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if (customerDao.delete(id)){
            return "Successfully deleted";
        } else {
            return "Failed";
        }
    }

    @Override
    public CustomerDTO getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        return new CustomerDTO(
                entity.getId(),
                entity.getTitle(),
                entity.getName(),
                entity.getDob(),
                entity.getSalary(),
                entity.getAddress(),
                entity.getCity(),
                entity.getProvince(),
                entity.getZip());
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws Exception {
        ArrayList<CustomerDTO> customerDTOs = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntities = customerDao.getAll();
        
        for (CustomerEntity entity : customerEntities) {
            CustomerDTO customerDTO = new CustomerDTO(
                entity.getId(),
                entity.getTitle(),
                entity.getName(),
                entity.getDob(),
                entity.getSalary(),
                entity.getAddress(),
                entity.getCity(),
                entity.getProvince(),
                entity.getZip());
            
            customerDTOs.add(customerDTO);
        }
        
        return customerDTOs;
    }
}

