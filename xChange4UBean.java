/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.xml.ws.WebServiceRef;
import webservices.CurrencyConversion_Service;

/**
 *
 * @author cmpncria
 */
@ManagedBean
@RequestScoped
public class xChange4UBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/xChange4You/CurrencyConversion.wsdl")
    private CurrencyConversion_Service service;

    /*@WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/xChange4You/CurrencyConversion.wsdl")*/
    
    private String requestedService;
    private String exchangeTo=null;
    private String exchangeFrom=null;
    private double amount;
    private String SenderName=null;
    private String ReceiverName=null;
    private String OriginOfMoney=null;
    private String DestinationOfMoney=null;
    private double CurrencyConRate;
    private String SenderCurrency=null;
    private String ReceiverCurrency=null;
    private double AmountTransfered;
    private double TransferFee;
    private double AmountReceived=AmountTransfered* CurrencyConRate;
    private double TotalReceived;
    private double TotalToBePaid=AmountTransfered+ TransferFee;
    private double result;
    
    
    public double getTotalReceived() {
        return TotalReceived;
    }
    public void setTotalReceived(double TotalReceived) {
        this.TotalReceived = TotalReceived;
    }
    
    public String getSenderName() {
        return SenderName;
    }
    public void setSenderName(String newValue) {
        this.SenderName = newValue;
    }
    
    public String getReceiverName() {
        return ReceiverName;
    }
    public void setReceiverName(String newValue) {
        this.ReceiverName = newValue;
    }
    
    public String getOriginOfMoney() {
        return OriginOfMoney;
    }
    public void setOriginOfMoney(String OriginOfMoney) {
        this.OriginOfMoney = OriginOfMoney;
    }
    public String getDestinationOfMoney() {
        return DestinationOfMoney;
    }
    public void setDestinationOfMoney(String DestinationOfMoney) {
        this.DestinationOfMoney = DestinationOfMoney;
    }
    public double getCurrencyConRate() {
        return CurrencyConRate;
    }
    public void setCurrencyConRate(double CurrencyConRate) {
        this.CurrencyConRate = CurrencyConRate;
    }
    public String getSenderCurrency() {
        return SenderCurrency;
    }
    public void setSenderCurrency(String SenderCurrency) {
        this.SenderCurrency = SenderCurrency;
    }
    public String getReceiverCurrency() {
        return ReceiverCurrency;
    }
    public void setReceiverCurrency(String ReceiverCurrency) {
        this.ReceiverCurrency = ReceiverCurrency;
    }
    public double getAmountTransfered() {
        return AmountTransfered;
    }
    public void setAmountTransfered(double AmountTransfered) {
        this.AmountTransfered = AmountTransfered;
    }
    public double getTransferFee() {
        return TransferFee= (2 * AmountTransfered)/100;
    }
    public void setTransferFee(double TransferFee) {
        this.TransferFee = TransferFee;
    }
    public double getAmountReceived() {
        return AmountReceived=AmountTransfered* CurrencyConRate;
    }
    public void setAmountReceived(double AmountReceived) {
        this.AmountReceived = AmountReceived;
    }
   public double getTotalToBePaid() {
        return TotalToBePaid= AmountTransfered+ TransferFee;
    }
    public void setTotalToBePaid(double TotalToBePaid) {
        this.TotalToBePaid = TotalToBePaid;
    }
    
    
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
    public xChange4UBean() {
    }
    
    public String getExchangeTo() {
        return exchangeTo;
    }

    public void setExchangeTo(String exchangeTo) {
        this.exchangeTo = exchangeTo;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String getExchangeFrom() {
        return exchangeFrom;
    }

    public void setExchangeFrom(String exchangeFrom) {
        this.exchangeFrom = exchangeFrom;
    }
    public String getRequestedService(){
        return requestedService;
    }
    public void setRequestedService(String requestedService){
        this.requestedService=requestedService;
    }

    private double euroToGBpound(double euro) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversion port = service.getCurrencyConversionPort();
        return port.EuroToGBpound(euro);
    }

    private double gBpoundToEuro(double gBpound) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversion port = service.getCurrencyConversionPort();
        return port.GBpoundToEuro(gBpound);
    }

    private double gBpoundToJPyen(double gBpound) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversion port = service.getCurrencyConversionPort();
        return port.GBpoundToJPyen(gBpound);
    }

    private double gBpoundToUSdollar(double gBpound) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversion port = service.getCurrencyConversionPort();
        return port.GBpoundToUSdollar(gBpound);
    }

    private double jPyenToGBpound(double jPyen) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversion port = service.getCurrencyConversionPort();
        return port.JPyenToGBpound(jPyen);
    }

    private double uSdollarToGBpound(double uSdollar) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversion port = service.getCurrencyConversionPort();
        return port.USdollarToGBpound(uSdollar);
    }
    
    public void callService(){
        if(requestedService.equals("Euro to GBpound")){
            this.result=this.euroToGBpound(this.amount);
        }
        if (requestedService.equals("GBpound To Euro")){
            this.result=this.gBpoundToEuro(this.amount);
        }
    }
    
    



}
