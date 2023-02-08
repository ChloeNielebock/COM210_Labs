/*
Chloe Nielebock
Lab 1 Question 2

2. Write a Java program to accept three item names, and 
prices, and output them. Also, output the average price if 
one of the items is named Peas (not case sensitive) 
otherwise output: “no average output”. 
 */
package program.pkg2.names.prices;

import java.util.*;
import java.text.DecimalFormat;

public class Program2NamesPrices 
{//start class
     private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) 
    {//start main
        Scanner kb = new Scanner(System.in);
        
        String names[] = new String[3];
        double prices[] = new double[3];
        double sum = 0;
        boolean peas = false;
        String finalOutput = "";
        
        for (int i = 0; i < names.length; i++)
        {
            //Takes in the names of the items
            System.out.println("Enter the name of item " + (i+1));
            names[i] = kb.nextLine();
            if (names[i].equalsIgnoreCase("peas"))
            {
                peas = true;
            }
            
            //Takes in the prices of the items
            System.out.println("Enter the price of item " + (i+1));
            prices[i] = kb.nextDouble();
            sum += prices[i];
            
            finalOutput += (names[i] + ": $" + df.format(prices[i]) + "\n");
            
            kb.nextLine();
        }
        
        //Outputs the names of the items with their associated prices
        System.out.print(finalOutput);
        //If an item is named peas, then the average price is displayed
        if (peas)
        {
            System.out.println("The average price is $" + df.format(sum/3));
        }
        else
        {
            System.out.println("no average output");
        }
    }//end main
}//end class
