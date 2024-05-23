/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom;

import java.util.ArrayList;
import pos.layered.dto.ItemDTO;
import pos.layered.service.SuperService;

/**
 *
 * @author sujah
 */
public interface ItemService extends SuperService {

    String addItem(ItemDTO itemDTO) throws Exception;

    String updateItem(ItemDTO itemDTO) throws Exception;

    String deleteItem(String id) throws Exception;

    ItemDTO getItem(String id) throws Exception;

    ArrayList<ItemDTO> getAllItem() throws Exception;
}
