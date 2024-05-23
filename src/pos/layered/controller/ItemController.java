/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.ArrayList;
import pos.layered.dto.CustomerDTO;
import pos.layered.dto.ItemDTO;
import pos.layered.service.ServiceFactory;
import pos.layered.service.custom.ItemService;

/**
 *
 * @author sujah
 */
public class ItemController {
    ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    public String saveItem(ItemDTO itemDTO)throws Exception{
        return itemService.addItem(itemDTO);
    }

    public ArrayList<ItemDTO> getAllItem() throws Exception {
        return itemService.getAllItem();
    }

    public String deleteItem(String itemCode) throws Exception {
        return itemService.deleteItem(itemCode);
    }

    public ItemDTO searchItem(String itemCode) throws Exception {
        return itemService.getItem(itemCode);
    }

    public String updateItem(ItemDTO itemDTO) throws Exception {
        return itemService.updateItem(itemDTO);
    }
}
