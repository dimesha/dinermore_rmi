/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import services.ServiceFactory;
import services.SuperService;
import services.custom.ChefOrderservice;
import services.custom.ItemService;
import services.custom.TelOrderservice;

/**
 *
 * @author dimesha
 */
public class ProxyHandler {
    private static ProxyHandler px;
    private ItemService is;
    private TelOrderservice os;
    private ChefOrderservice cs;

    private ProxyHandler() throws NotBoundException, MalformedURLException, RemoteException, Exception {
        ServiceFactory serve=(ServiceFactory) Naming.lookup("rmi://localhost:5050/Dine");
        is=(ItemService) serve.getService(ServiceFactory.ServiceTypes.ITEM);
        os=(TelOrderservice) serve.getService(ServiceFactory.ServiceTypes.TELORDER);
        cs=(ChefOrderservice) serve.getService(ServiceFactory.ServiceTypes.CHEFORDER);
    }
    public static ProxyHandler getinstance() throws MalformedURLException, RemoteException, Exception{
        if (px==null) {
            px=new ProxyHandler();
        }
        return px;
    }
    
    public enum Proxytype{
        CUSTOMER,TELORDER,CHEFORDER,ITEM
    }
    public SuperService getproxy(Proxytype type){
        switch(type){
            case CHEFORDER:
                return cs;
            case TELORDER:
                return os;
            case ITEM:
                return is;
            default :
                return null;
                
        }
    }
    
}
