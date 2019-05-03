/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author vladimirKosik
 */
@WebService(serviceName = "CurrencyConversion")
public class CurrencyConversion {

    /**
     * Web service operation
     * @param GBpound
     * @return 
     */
    @WebMethod(operationName = "GBpoundToEuro")
    public double GBpoundToEuro(@WebParam(name = "GBpound") double GBpound) {
        //TODO write your implementation code here:
        return GBpound * 1.40;
    }

    /**
     * Web service operation
     * @param Euro
     * @return 
     */
    @WebMethod(operationName = "EuroToGBpound")
    public double EuroToGBpound(@WebParam(name = "Euro") double Euro) {
        //TODO write your implementation code here:
        return Euro * 0.8;
    }

    /**
     * Web service operation
     * @param GBpound
     * @return 
     */
    @WebMethod(operationName = "GBpoundToUSdollar")
    public double GBpoundToUSdollar(@WebParam(name = "GBpound") double GBpound) {
        //TODO write your implementation code here:
        return 0.0;
    }

    /**
     * Web service operation
     * @param USdollar
     */
    @WebMethod(operationName = "USdollarToGBpound")
    public double USdollarToGBpound(@WebParam(name = "USdollar") double USdollar) {
        //TODO write your implementation code here:
        return 0.0;
    }

    /**
     * Web service operation
     * @param GBpound
     * @return 
     */
    @WebMethod(operationName = "GBpoundToJPyen")
    public double GBpoundToJPyen(@WebParam(name = "GBpound") double GBpound) {
        //TODO write your implementation code here:
        return 0.0;
    }

    /**
     * Web service operation
     * @param JPyen
     * @return 
     */
    @WebMethod(operationName = "JPyenToGBpound")
    public double JPyenToGBpound(@WebParam(name = "JPyen") double JPyen) {
        //TODO write your implementation code here:
        return 0.0;
    }

    


    
}
