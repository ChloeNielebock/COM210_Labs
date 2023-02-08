/*
Chloe Nielebock
Lab 1 Question 3

3. Write a Java program to accept a given number of item names 
and prices and then output them in the reverse order in 
which they were input. In addition, output the average 
price if one of the items is named Peas (not case 
sensitive) otherwise output: “no average output”. (The 
first user input will be the number of items to process.) 
 */
package program.pkg3.names.prices;

import java.util.*;
import java.text.DecimalFormat;

public class Program3NamesPrices 
{//start class
     private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) 
    {//start main
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter the number of items ");
        int amtItems = kb.nextInt();
        
        String names[] = new String[amtItems];
        double prices[] = new double[amtItems];
        double sum = 0;
        boolean peas = false;
        
        for (int i = 0; i < names.length; i++)
        {
            kb.nextLine();
            
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
        }
        
        //Outputs the names of the items and their associated prices
        //in the reverse order in which they were input
        for (int i = names.length-1; i >= 0; i--)
        {
            System.out.println(names[i] + ": $" + df.format(prices[i]));
        }
           
        //If an item is named peas, then the average price is displayed
        if (peas)
        {
            System.out.println("The average price is $" + df.format(sum/amtItems));
        }
        else
        {
            System.out.println("no average output");
        }
    }//end main
}//end class
