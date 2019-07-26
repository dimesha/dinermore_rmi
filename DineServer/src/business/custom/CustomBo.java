/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.custom;

import business.SuperBo;
import dto.CustomerDto;
import java.util.ArrayList;

/**
 *
 * @author dimesha
 */
public interface CustomBo extends SuperBo{
    public boolean addCustomer(CustomerDto dto)throws Exception;
    public boolean deleteCustomer(String id)throws Exception;
    public boolean updateCustomer(CustomerDto dto)throws Exception;
    public CustomerDto searchCustomer(String id)throws Exception;
    public ArrayList<CustomerDto> getAllCustomers()throws Exception;
    
}
