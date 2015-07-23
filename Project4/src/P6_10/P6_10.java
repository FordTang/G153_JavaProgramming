/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P6_10;

import java.util.Scanner;

/**
 * This program will find the approximate root value of a number through the Heron Method.
 * @author C02122472
 */
public class P6_10 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("This program will find the approximate root value of a number through the Heron Method.");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value:  ");
        double value = in.nextDouble();
        System.out.print("Enter Check (small) Value:  ");
        double e = in.nextDouble();
        RootApproximator approx = new RootApproximator(value, e);
        
        if (approx.hasMoreGuesses() == false) //This will return a root value if the first run through satisfies the check value.
            System.out.println(approx.nextGuess());
        
        while (approx.hasMoreGuesses())  //This will loop as many times as necessary to find a root value that satisfies the check value.
            System.out.println(approx.nextGuess());
    }
}
