/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.custom.impl.ChefOrderDaoImpl;
import dao.custom.impl.ItemDaoImpl;
import dao.custom.impl.TelOrderDaoImpl;

/**
 *
 * @author dimesha
 */
public class DAofactory {
    public static DAofactory daofactory;

    private DAofactory() {
    }
    public enum DaoTypes{
        CUSTOMER,TELORDER,CHEFORDER,ITEM
    }
    public static DAofactory getinstance(){
        if (daofactory==null) {
            daofactory=new DAofactory();
        }
        return daofactory;
    }
    public SuperDao getDAO(DaoTypes types){
        switch(types){
            case CHEFORDER:
                return  new ChefOrderDaoImpl();
            case ITEM:
                return  new ItemDaoImpl();
            case TELORDER:
                return new TelOrderDaoImpl();
            default :
                return null;
        }
    }
    
    
}
