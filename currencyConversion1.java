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
 * @author CMPLCHA1
 */
@WebService(serviceName = "currencyConversion1")
public class currencyConversion1 {
    
     @WebMethod(operationName = "GBPToJPY")
    public double GBPToJPY(@WebParam(name = "GBP") double GBP) {
        return GBP * 149.78 ;
    }
    
    @WebMethod(operationName = "JPYToGBP")
    public double JPYToGBP(@WebParam(name = "JPY") double JPY) {
        return JPY * 0.0067;
    }
    
    @WebMethod(operationName = "GBPToEUR")
    public double GBPToEUR(@WebParam(name = "GBP") double GBP) {
        return GBP*1.14;
    }
    
    @WebMethod(operationName = "GBPToUSD")
    public double GBPToUSD(@WebParam(name = "GBP") double GBP) {
        return GBP*1.41;
    }
    
     @WebMethod(operationName = "JPYToEUR")
    public double JPYToEUR(@WebParam(name = "JPY") double JPY) {
        return JPY * 0.0076;
    }
    
    @WebMethod(operationName = "JPYToUSD")
    public double JPYToUSD(@WebParam(name = "JPY") double JPY) {
        return JPY  * 0.0094;
    }
    
    @WebMethod(operationName = "USDToGBP")
    public double USDToGBP(@WebParam(name = "USD") double USD) {
        return USD *0.71;
    }
    
    @WebMethod(operationName = "USDToJPY")
    public double USDToJPY(@WebParam(name = "USD") double USD) {
        return USD * 106.07;
    }
    
    @WebMethod(operationName = "USDToEUR")
    public double USDToEUR(@WebParam(name = "USD") double USD) {
        return USD * 0.81;
    }
    
    @WebMethod(operationName = "EURToUSD")
    public double EURToUSD(@WebParam(name = "EUR") double EUR) {
        return EUR*1.23;
    }
    
    @WebMethod(operationName = "EURToGPD")
    public double EURToGPD(@WebParam(name = "EUR") double EUR) {
        return EUR * 0.88;
    }
    
        @WebMethod(operationName = "EURToJPY")
    public double EURToJPY(@WebParam(name = "EUR") double EUR) {
        return EUR *131.04;
    }

}
 