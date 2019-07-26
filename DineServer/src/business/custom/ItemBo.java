/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.custom;

import business.SuperBo;
import dto.ItemDto;
import java.util.ArrayList;

/**
 *
 * @author dimesha
 */
public interface ItemBo extends SuperBo{
    public boolean addItem(ItemDto dto)throws Exception;
    public boolean deleteItem(String code)throws Exception;
    public boolean updateItem(ItemDto dto)throws Exception;
    public ItemDto searchItem(String code)throws Exception;
    public ArrayList<ItemDto> getAllItem()throws Exception;
}
