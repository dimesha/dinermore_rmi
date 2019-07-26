/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import java.rmi.server.UnicastRemoteObject;
import service.custom.impl.ChefOrderserviceImpl;
import service.custom.impl.ItemserviceImpl;
import service.custom.impl.TelOrderserviceImpl;
import services.ServiceFactory;
import services.SuperService;

/**
 *
 * @author dimesha
 */
public class ServiceFactoryimpl extends UnicastRemoteObject implements ServiceFactory{
    private static ServiceFactoryimpl servefac;

    public ServiceFactoryimpl() throws Exception{
    }
    public static ServiceFactoryimpl getinstance() throws Exception{
        if (servefac==null) {
            servefac=new ServiceFactoryimpl();
        }
        return servefac;
    }
    

    @Override
    public SuperService getService(ServiceTypes types) throws Exception {
         switch(types){
             case CHEFORDER:
                 return new ChefOrderserviceImpl();
             case TELORDER:
                 return new TelOrderserviceImpl();
             case ITEM:
                 return new ItemserviceImpl();
             default :
                 return null;
         }
    }
    
}
