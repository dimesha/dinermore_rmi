/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.custom.impl.ChefOrderBoImpl;
import business.custom.impl.CustomerBoImpl;
import business.custom.impl.ItemBoImpl;
import business.custom.impl.TelOrderBoImpl;

/**
 *
 * @author dimesha
 */
public class BoFactory {
    public static BoFactory bofact;

    private BoFactory() {
    }
    public static BoFactory getinstance(){
        if (bofact==null) {
           bofact=new BoFactory();
                   
        }
        return bofact;
    }
    public enum Botypes{
        CUSTOMER,ITEM,TELORDER,CHEFORDER
    }
    public SuperBo getboTypes(Botypes types){
        switch(types){
            case CHEFORDER:
                return new ChefOrderBoImpl();
            case CUSTOMER:
                return new CustomerBoImpl();
            case ITEM:
                return new ItemBoImpl();
                case TELORDER:
                    return new TelOrderBoImpl();
                default:
                    return null;
        }
    }
    
}
