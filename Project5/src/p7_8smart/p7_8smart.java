/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_8smart;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This program will create an array of random unique numbers.
 * @author C02122472
 */
public class p7_8smart
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Random gen = new Random();
        ArrayList<Integer> permArray = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        
        // TODO code application logic here
        System.out.println("This program will create an array of numbers arranged randomly from a list of consecutive numbers.");
        System.out.print("Please enter how large you want the array to be:  ");
        int amount = in.nextInt();
        
        PermutationGenerator consecutive = new PermutationGenerator(amount);
        
        /*
         * This loop will take a number from the consecutive array built in the PermutationGenerator Class and add it to the permutation array.
         */
        for (int i = 0; i < amount; i++)
        {
            permArray.add(consecutive.nextPermutation());
        }
        
        System.out.println(permArray);
    }
}
