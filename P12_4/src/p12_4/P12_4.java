/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12_4;

import java.util.Scanner;

/**
 * Final project:  Arithmetic game consisting of 3 levels.  5 correct answers advances a level, and each problem can be attempted twice.
 * @author C02122472
 */
public class P12_4
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int answer;
        String name;
        
        /*
         * This will get player name; not really necessary
         */
        System.out.print("Please enter Player name:  ");
        name = in.next();
        
        /*
         * This starts the player class which handles most of the game logic.
         */
        Player play = new Player(name);
        
        /*
         * First run to get the answer to start the MorePlay loop
         */
        System.out.println("\nLevel:  " + play.getLevel());
        System.out.println("Score:  " + play.getScore());
        System.out.println("What is:  " + play.getProblem());
        System.out.print("Please enter an answer (-1 to quit):  ");
        
        answer = in.nextInt();
        
        if (answer < 0)  //This is a check to see if the player wants to quit.
        {
            System.out.println("\nGood Bye!");
            System.exit(0);
        }
        
        /*
         * This loop will continue until the game meets the finish conditions.
         */
        while (play.morePlay(answer))
        {
            System.out.println("\nLevel:  " + play.getLevel());
            System.out.println("Score:  " + play.getScore());
            System.out.println("What is:  " + play.getProblem());
            System.out.print("Please enter an answer (-1 to quit):  ");
            
            answer = in.nextInt();
            
            if (answer < 0)  //This is a check to see if the player wants to quit.
            {
                System.out.println("\nGood Bye!");
                System.exit(0);
            }
        }
        
        System.out.println("\nGreat Job, " + name + "!");
    }
}
