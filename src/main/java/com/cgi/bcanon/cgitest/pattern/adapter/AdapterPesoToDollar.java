package com.cgi.bcanon.cgitest.pattern.adapter;

public class AdapterPesoToDollar extends PaymentInPesos
{
    private PaymentInDollarService paymentInDollarService;
    private static final double EXCHANGE_RATE = 4000;
    
    public AdapterPesoToDollar(PaymentInDollarService pPaymentInDollarService)
    {
        paymentInDollarService = pPaymentInDollarService;
    }
    
    @Override
    public void paymentProcess(double pesos)
    {
        double dollarsAmount = pesos/EXCHANGE_RATE;
        
        paymentInDollarService.payment(dollarsAmount);
    }
    
}
