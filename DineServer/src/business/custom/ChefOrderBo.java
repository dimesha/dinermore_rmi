/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.custom;

import business.SuperBo;
import dto.ChefOrderDto;

/**
 *
 * @author dimesha
 */
public interface ChefOrderBo  extends SuperBo{
      public boolean purchaseOrder(ChefOrderDto dtos) throws Exception;
}
