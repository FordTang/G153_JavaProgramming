/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_8smart;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ford
 */
public class PermutationGenerator
{
    private ArrayList<Integer> consecutive = new ArrayList<Integer>();
    private Random gen = new Random();
    
    public PermutationGenerator(int amount)
    {
        /*
         * This loop will add consecutive numbers to the array up to the amount specified by the object.
         */
        for (int i = 1; i <= amount; i++)
        {
            consecutive.add(i);
        }
    }
    
    /*
     * This method will return a number randomly from the consecutive array and will delete that entry accordingly to prevent returning the same number.
     */
    public int nextPermutation()
    {
        int randomNumber = gen.nextInt(consecutive.size());
        int pick = consecutive.get(randomNumber);
        consecutive.remove(randomNumber);
        return pick;
    }
}
