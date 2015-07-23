/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_8;

import java.util.Random;
import java.util.Scanner;

/**
 * This program will use the brute force method to generate an array of numbers without duplicates.
 * @author C02122472
 */
public class p7_8
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Random gen = new Random();        
        Scanner in = new Scanner(System.in);        
        
        // TODO code application logic here
        
        System.out.println("This program will create an array of unique numbers arranged randomly by using the brute force method");
        System.out.print("Please enter how large you want the array to be:  ");
        int amount = in.nextInt();
        
        int[] randomArray = new int[amount];
        /*
         * This first loop will put the random number generated into the Array.
         */
        for (int i = 0; i < amount; i++)
        {
            int randomNumber = gen.nextInt(amount) + 1;
            
            /*
             * This second loop will check if the random number generating already exists in the array.
             */
            for (int j = 0;  j <= i; j++)
            {
                /*
                 * If the random number generated already exists in the array, this will produce a new random number and reset the second loop to 0.
                 */
                if (randomArray[j] == randomNumber)
                {
                    randomNumber = gen.nextInt(amount) + 1;
                    j = -1;
                }
            }
            randomArray[i] = randomNumber;
            System.out.println("Array[" + i + "] = " + randomArray[i]);
        }
    }
}
