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
@WebService(serviceName = "MoneyTransfer")
public class MoneyTransfer {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AmountReceived")
    public double AmountReceived(@WebParam(name = "AmountReceived") double AmountReceived) {
        //TODO write your implementation code here:
        return AmountReceived;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AmountTransfered")
    public double AmountTransfered(@WebParam(name = "AmountTransfered") double AmountTransfered) {
        //TODO write your implementation code here:
        return AmountTransfered;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CurrencyConversionRate")
    public double CurrencyConversionRate(@WebParam(name = "CurrencyConversionRate") double CurrencyConversionRate) {
        //TODO write your implementation code here:
        return CurrencyConversionRate;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DestinationOfMoney")
    public String DestinationOfMoney(@WebParam(name = "DestinationOfMoney") String DestinationOfMoney) {
        //TODO write your implementation code here:
        return DestinationOfMoney;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "NameOfReceiver")
    public String NameOfReceiver(@WebParam(name = "NameOfReceiver") String NameOfReceiver) {
        //TODO write your implementation code here:
        return NameOfReceiver;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "NameOfSender")
    public String NameOfSender(@WebParam(name = "NameOfSender") String NameOfSender) {
        //TODO write your implementation code here:
        return NameOfSender;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "OriginOfMoney")
    public String OriginOfMoney(@WebParam(name = "OriginOfMoney") String OriginOfMoney) {
        //TODO write your implementation code here:
        return OriginOfMoney;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ReceiverCurrency")
    public String ReceiverCurrency(@WebParam(name = "ReceiverCurrency") String ReceiverCurrency) {
        //TODO write your implementation code here:
        return ReceiverCurrency;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SenderCurrency")
    public String SenderCurrency(@WebParam(name = "SenderCurrency") String SenderCurrency) {
        //TODO write your implementation code here:
        return SenderCurrency;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "TransferFee")
    public double TransferFee(@WebParam(name = "TransferFee") double TransferFee) {
        //TODO write your implementation code here:
        return 2;
    }
}
