package com.cgi.bcanon.cgitest.pattern.singleton;

public class Singleton 
{
    private static Singleton singletonInstance;

    private Singleton() 
    {
    }
    
    public static synchronized Singleton getInstance()
    {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public void showMessage()
    {
        System.out.println("Mensaje accedido desde única instancia de Singleton");
    }
}
