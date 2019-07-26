/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.custom;

import dto.ChefOrderDto;
import services.SuperService;

/**
 *
 * @author dimesha
 */
public interface ChefOrderservice extends SuperService{
     public boolean purchaseOrder(ChefOrderDto dto) throws Exception;
}
