/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P8_7;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author C02122472
 */
public class Main
{
    private final static ArrayList<String> students = new ArrayList<String>();
    private final static ArrayList<Double> scores = new ArrayList<Double>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {        
        Scanner in = new Scanner(System.in);
        
        // This adds students to the array.
        System.out.println("Enter students' names, Q to quit:");
        while (in.hasNext())
        {
            String str = in.next();
            if (str.equalsIgnoreCase("Q"))
                break;
            
            students.add(str);
        }
        
        //This will input students scores into the array and return the final score.
        for (String n: students)
        {
            System.out.println("Enter scores for " + n + ", Q to quit:");
            while (in.hasNextDouble())
            {
                addScore(in.nextDouble());
            }
            in.next();
            System.out.println("Final Score:  " + finalScore());
            scores.clear();
        }
    }
    
    //This method places scores into the scores array.
    public static void addScore(double score)
    {
        scores.add(score);
    }
    
    
    //This method will total up the scores in the array.
    public static double sum()
    {
        double total = 0;
        for (double element : scores)
        {
            total += element;
        }
        
        return total;
    }
    
    //This method will find the minimum score in the array.
    public static double minimum()
    {
        if (scores.size() == 0)
            return 0;
        
        double smallest = scores.get(0);
        
        for (int i = 1; i < scores.size(); i++)
        {
            if (scores.get(i) < smallest)
            {
                smallest = scores.get(i);
            }
        }
        
        return smallest;
    }
    
    //This method computes the total score minus the minimum.
    public static double finalScore()
    {
        if (scores.size() == 0)
            return 0;
        else if (scores.size() == 1)
            return scores.get(0);
        else
            return sum() - minimum();
    }
}

