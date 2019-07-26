/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.custom;

import dto.ItemDto;
import java.util.ArrayList;
import services.SuperService;

/**
 *
 * @author dimesha
 */
public interface ItemService extends SuperService{
     public boolean addItem(ItemDto dto)throws Exception;
    public boolean deleteItem(String code)throws Exception;
    public ItemDto searchItem(String code)throws Exception;
    public boolean updateItem(ItemDto dto)throws Exception;
    public ArrayList<ItemDto> getAllItems()throws Exception;
    
}
