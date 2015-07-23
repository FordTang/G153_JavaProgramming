/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12_4;

import java.util.Random;

/**
 * This class generates the problems for the game.
 * @author C02122472
 */
public class ProblemGenerator
{
    private Random generator = new Random();
    private int a, b, answer;
    
    public ProblemGenerator()
    {
    }
    
    /*
     * This will create a new problem depending on the level given.
     */
    public String newProblem(int level)
    {        
        if (level == 1)  //This creates a problem according to level 1; Addition of 2 single digit numbers with the sum of less than 10.
        {
            a = generator.nextInt(8) + 1;
            b = generator.nextInt(9 - a) + 1;
                       
            answer = a + b;  //This sets the answer variable to the correct answer.
            
            return a + " + " + b + " = ?";  //This returns problem in string format.
        }
        
        else if (level == 2)  //Level 2; Addition of 2 single digit numbers.
        {
            a = generator.nextInt(9) + 1;
            b = generator.nextInt(9) + 1;
            
            answer = a + b;  //This sets the answer variable to the correct answer.
            
            return a + " + " + b + " = ?";  //This returns problem in string format.
        }
        
        else  //This sets the conditions for level 3+; The subtraction of 2 single digit numbers with a non-negative total.
        {
            a = generator.nextInt(9) + 1;
            b = generator.nextInt(a) + 1;
                        
            answer = a - b;  //This sets the answer variable to the correct answer.
            
            return a + " - " + b + " = ?";  //This returns problem in string format.
        }
    }
    
    /*
     * This returns the current problem generated according to level.
     */
    public String getProblem(int level)
    {
        if (level == 1 || level == 2)
        {
            return a + " + " + b + " = ?";  //This returns problem in string format.
        }
        
        else
        {
            return a + " - " + b + " = ?";  //This returns problem in string format.
        }
    }
    
    /*
     * This returns the answer to the current problem.
     */
    public int getAnswer()
    {
        return answer;
    }        
}