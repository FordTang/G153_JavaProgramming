/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12_4;

/**
 * This class controls the conditions for each level and keeps track of the current game level
 * @author C02122472
 */
public class Game
{
    private int level, maxScore;
    
    /*
     * This constructor sets the level to 1 at start.
     */
    public Game()
    {
        level = 1;
        maxScore = 4;
    }
    
    /*
     * This returns the score condition to advance to the next level.
     */
    public int getMax(int lvl)
    {
        if (lvl == 1 || lvl == 2)  //This is for level 1 and 2, can be seperated for each level to set specific condiions.
        {
            return maxScore;
        }
        else
        {
            return maxScore;
        }
    }
    
    /*
     * This method will increment the current level.
     */
    public void changeLevel()
    {
        level++;
    }
    
    /*
     * This returns the current level.
     */
    public int getLevel()
    {
        return level;
    }
}
