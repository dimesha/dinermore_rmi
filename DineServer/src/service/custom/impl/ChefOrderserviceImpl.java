/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.custom.impl;

import dto.ChefOrderDto;
import java.rmi.server.UnicastRemoteObject;
import observer.Observer;
import services.custom.ChefOrderservice;

/**
 *
 * @author dimesha
 */
public class ChefOrderserviceImpl extends UnicastRemoteObject implements ChefOrderservice{

    public ChefOrderserviceImpl() throws Exception{
    }
    

    @Override
    public boolean purchaseOrder(ChefOrderDto dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void register(Observer ob) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unregister(Observer ob) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notyfyAllObservers(String message) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
