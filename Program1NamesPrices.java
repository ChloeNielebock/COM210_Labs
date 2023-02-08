/*
Chloe Nielebock
Lab 1 Question 1

1. Write a Java program to accept the names of three items 
along with their prices from the user and output them and 
the average price to a user. 
 */
package program.pkg1.names.prices;

import java.util.*;
import java.text.DecimalFormat;

public class Program1NamesPrices 
{//start class
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) 
    {//start main
        Scanner kb = new Scanner(System.in);
        
        String names[] = new String[3];
        double prices[] = new double[3];
        double sum = 0;
        String finalOutput = "";
        
        for (int i = 0; i < names.length; i++)
        {
            //Takes in the names of the items
            System.out.println("Enter the name of item " + (i+1));
            names[i] = kb.nextLine();
            
            //Takes in the prices of the items
            System.out.println("Enter the price of item " + (i+1));
            prices[i] = kb.nextDouble();
            sum += prices[i];
            
            finalOutput += (names[i] + ": $" + df.format(prices[i]) + "\n");
            
            kb.nextLine();
        }
        
        //Outputs the names of the items with their associated prices
        System.out.println(finalOutput + "The average price is $" + df.format(sum/3));
    }//end main
}//end class
