package com.cgi.bcanon.cgitest.sort;

import java.util.Arrays;

public class Sorting 
{
    
    public static void main(String[] args)
    {
        Sorting sorting = new Sorting();
        
        int[] myArray = {5, 4, 10, 3, 8, 2, 1};
        
        int[] myArrayBubble = myArray.clone();
        int[] myArraySelection = myArray.clone();
        int[] myArrayInsertion = myArray.clone();
        
        sorting.sortingByBubble(myArrayBubble);
        
        System.out.println("Array por método de ordenamiento Burbuja: "+Arrays.toString(myArrayBubble));
        
        /* BONUS */
        sorting.sortingBySelection(myArraySelection);
        
        System.out.println("Array por método de ordenamiento de Selección: "+Arrays.toString(myArrayBubble));
        
        Sorting.sortingByInsertion(myArrayInsertion);
        
        System.out.println("Array por método de ordenamiento de Inserción: "+Arrays.toString(myArrayBubble));
        
        /* BONUS */
        
    }
    
    public void sortingByBubble(int[] arrayBubble) 
    {
        int auxLength = arrayBubble.length-1;
        
        for (int i = 0; i < auxLength; i++) 
        {
            for (int j = 0; j< auxLength - i; j++) 
            {
                if (arrayBubble[j] >arrayBubble[j + 1]) 
                {
                    
                    int tempValue = arrayBubble[j];
                    arrayBubble[j] = arrayBubble[j + 1];
                    arrayBubble[j + 1] = tempValue;
                }
            }
        }
    }
    
    public void sortingBySelection(int[] arraySelection)
    {
        int auxLenght = arraySelection.length;
        
        for (int i = 0; i < auxLenght - 1; i++) 
        {
            int minPosition = i;
            
            for (int j = i + 1; j < auxLenght; j++) {
                if (arraySelection[j] < arraySelection[minPosition]) 
                {
                    minPosition = j;
                }
            }
            
            int valueTemp = arraySelection[minPosition];
            arraySelection[minPosition] = arraySelection[i];
            arraySelection[i] = valueTemp;
        }
    }
    
    public static void sortingByInsertion(int[] arrayInsertion)
    {
        int auxLength = arrayInsertion.length;
        
        for (int i = 1; i < auxLength; i++)
        {
            int key = arrayInsertion[i];
            int j = i - 1;

            while (j >= 0 && arrayInsertion[j] > key)
            {
                arrayInsertion[j + 1] = arrayInsertion[j];
                
                j = j - 1;
            }
            
            arrayInsertion[j + 1] = key;
        }
    }

}
