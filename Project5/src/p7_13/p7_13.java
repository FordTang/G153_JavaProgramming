/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_13;

import java.util.Scanner;

/**
 *
 * @author C02122472
 */
public class p7_13
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String player = " X ";
        TicTacToe game = new TicTacToe();
        boolean done = false;
        
        // TODO code application logic here
        
        while (!done)
        {
            System.out.print(game.toString());
            System.out.print("Row for " + player + " (0 to exit):  ");
            int row = in.nextInt() - 1;
            
            /*
             * This checks if the players want to quit.
             */
            if (row < 0)
                done = true;
            else
            {
                System.out.print("Column for " + player + ":  ");
                int column = in.nextInt() - 1;
                game.set(row, column, player);
                
                /*
                 * This loop will run a check to see if there are any winners.
                 */
                if (game.getWinner(player) == player)
                {
                    System.out.println("The winner is" + player + "!!!");
                    done = true;
                }
                
                /*
                 * This loop determines which player should be next.
                 */
                if (player.equals(" X "))
                    player = " O ";
                else
                    player = " X ";
            }
        }
    }
}
