/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.custom;

import business.SuperBo;
import dto.TelOrderDto;

/**
 *
 * @author dimesha
 */
public interface TelOrderBo extends SuperBo{
      public boolean purchaseOrder(TelOrderDto dtos) throws Exception;
}
