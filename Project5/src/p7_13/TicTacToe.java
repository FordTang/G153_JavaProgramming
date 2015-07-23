/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_13;

/**
 * This class builds the board and places the players on the board, it can also check for winners.
 * @author C02122472
 */
public class TicTacToe
{
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    
    public TicTacToe()
    {
        board = new String[ROWS][COLUMNS];
        
        /*
         * This will set a blank board.
         */
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                board[i][j] = "   ";
            }
        }
    }
    
    /*
     * This method sets the players on the board.
     */
    public void set(int i, int j, String player)
    {
        /*
         * This will check to see if the space is open for the player before setting the player.
         */
        if (board[i][j].equals("   "))
        {
            board[i][j] = player;
        }
    }
    
    /*
     * This method draws the board.
     */
    public String toString()
    {
        String r = "";
        for (int i = 0; i < ROWS; i++)
        {
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++)
                r = r + board[i][j];
            r = r + "|\n";
        }
        return r;
    }
    
    /*
     * This method cheks to see if there are any winners by row.
     */
    private boolean checkRow(String player)
    {
        int count = 0;
        for (int i = 0; i < ROWS; i++)
        {
            count = 0;
            for (int j = 0; j < COLUMNS; j++)
            {
                if (board[i][j].equals(player))
                    count++;
                if (count == 3)
                    return true;
            }
        }
        return false;
    }
    
    /*
     * This method checks to see if there are any winners by Columns.
     */
    private boolean checkCol(String player)
    {
        int count = 0;
        for (int i = 0; i < ROWS; i++)
        {
            count = 0;
            for (int j = 0; j < COLUMNS; j++)
            {
                if (board[j][i].equals(player))
                    count++;
                if (count == 3)
                    return true;
            }
        }
        return false;
    }
    
    /*
     * This method checks to see if there are any winners from diagonal Leeft to Right.
     */
    private boolean checkDiagLR(String player)
    {
        int count = 0;
        for (int i = 0; i < 3; i++)
            if (board[i][i].equals(player))  
                count++;
        
        if (count == 3)
            return true;
        else
            return false;
    }
    
    /*
     * This method checks to see if there are any winners from diagonal Right to Left.
     */
    private boolean checkDiagRL(String player)
    {
        int count = 0;
        if (board[0][2].equals(player))
            count++;
        if (board[1][1].equals(player))
            count++;
        if (board[2][0].equals(player))
            count++;
        
        if (count == 3)
            return true;
        else
            return false;
    }
    
    /*
     * This method will return a winner if found.
     */
    public String getWinner(String player)
    {
        if (checkRow(player))
            return player;
        if (checkCol(player))
            return player;
        if (checkDiagRL(player))
            return player;
        if (checkDiagLR(player))
            return player;
        else
            return " ";
    }
}