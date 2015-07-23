/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P6_10;

/**
 * This class will approximate a root value of a certain number through a series of guesses compared to a check value.
 * @author C02122472
 */
public class RootApproximator 
{
    private double x, guess, a, EPSILON;
    
    /*
     * This is the class constructor and will take values from the object.
     */
    public RootApproximator (double value, double E)
    {
        x = 1;
        a = value;
        EPSILON = E;
        guess = (x + (a/x))/2;
        x += guess;
    }
    
    /*
     * This method will perform a guess and return a true or false value compared to a check value.
     */
    public boolean hasMoreGuesses()
    {
        if (x - guess > EPSILON)
        {
            x = guess;
            guess = (x + (a/x))/2;
            return true;
        }
        else
            return false;
    }
    
    /*
     * This method returns the latest approximate guess value.
     */
    public double nextGuess()
    {
        return guess;
    }
}
