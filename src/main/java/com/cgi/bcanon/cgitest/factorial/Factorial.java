package com.cgi.bcanon.cgitest.factorial;

import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Factorial factorial = new Factorial();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número a calcular: ");
        long value = sc.nextLong();
        
        long valueAsc = value;
        long valueDesc = value;

        long resultAscending = factorial.factorialRecursionAscending(1, valueAsc);
        System.out.println("El factorial (Ascendente) calculado de "+value +" es: "+resultAscending);
        
        long resultDescending = factorial.factorialRecursionDescending(valueDesc);
        System.out.println("El factorial (Descendente) calculado de "+value +" es: "+resultDescending);
    }
    
    public long factorialRecursionAscending(long var, long numFinal)
    {
        if(var == numFinal){
            return numFinal;
        }else{
            var = var * factorialRecursionAscending(var+1, numFinal);
        }
        return var;
    }
    
    public long factorialRecursionDescending(long num)
    {
        if(num <= 1){
            return num;
        }else{
            num = num * factorialRecursionDescending(num-1);
        }
        return num;
    }
}
