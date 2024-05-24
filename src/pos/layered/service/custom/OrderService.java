/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.service.custom;

import pos.layered.dto.OrderDTO;
import pos.layered.service.SuperService;

/**
 *
 * @author sujah
 */
public interface OrderService extends SuperService{
    String placeOrder(OrderDTO orderDTO) throws Exception;
}
