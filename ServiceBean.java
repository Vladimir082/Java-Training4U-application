/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Map;
import javax.faces.context.FacesContext;

/**
 *
 * @author cmpvkosi
 */
@Named(value = "serviceBean")
@SessionScoped
public class ServiceBean implements Serializable {
    private String requestedService ;
 
    
    public ServiceBean() {
    }
    public String getRequestedService(){
        return requestedService;
    }
    public void setRequestedService(String requestedService){
        this.requestedService = requestedService;
    }

    

    public void goToInputPage (String service){
    if (service.equals("CurrencyConversion")|| service.equals("MoneyTransfer")){
        this.requestedService=service;
        
        FacesContext.getCurrentInstance()
                .getApplication().getNavigationHandler()
                .handleNavigation(FacesContext.getCurrentInstance(), null,"/input.xhtml");
    }
   

} 
}

