/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.Remote;

/**
 *
 * @author dimesha
 */
public interface ServiceFactory extends Remote{
public enum ServiceTypes{
    CUSTOMER,ITEM,TELORDER,CHEFORDER
    }    

public SuperService getService(ServiceTypes types)throws Exception;

}
