package com.cgi.bcanon.cgitest.pattern.adapter;

public class PaymentMain
{
    public static void main(String[] args)
    {
        PaymentInPesos pInPesos = new PaymentInPesos();
        pInPesos.paymentProcess(35500);
        
        PaymentInDollarService pInDollarS = new PaymentInDollarService();
        AdapterPesoToDollar adapterPToD = new AdapterPesoToDollar(pInDollarS);
        adapterPToD.paymentProcess(35500);
    }
}
