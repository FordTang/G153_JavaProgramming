/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p12_4;

/**
 * This class will handle majority of the game logic.
 * @author C02122472
 */
public class Player
{
    private int score, tries;
    private String name;
    private ProblemGenerator problems = new ProblemGenerator();
    private Game gameSet = new Game();
    
    /*
     * Player class constructor, sets player name; not necessary at the point.
     */
    public Player(String user)
    {
        name = user;
        problems.newProblem(gameSet.getLevel());
    }
    
    /*
     * This returns the current level of the game.
     */
    public int getLevel()
    {
        return gameSet.getLevel();
    }
    
    /*
     * This returns the current score of the level.
     */
    public int getScore()
    {
        return score;
    }
    
    /*
     * This returns the current problem created from the problem generator.
     */
    public String getProblem()
    {
        return problems.getProblem(gameSet.getLevel());
    }
    
    /*
     * This loop controls the wether the game should continue and if a new problem should be generated.
     */
    public boolean morePlay(int ans)
    {
        if (ans == problems.getAnswer()) //This checks if the inputed data matches the correct answer.
        {
            score++;
            tries = 0;
            
            if (score > gameSet.getMax(gameSet.getLevel()))  //This checks if the current score should advance the level.
            {
                gameSet.changeLevel();
                
                if (gameSet.getLevel() > 3)  //This checks if the current level should stop the game.
                {
                    return false;
                }
                
                score = 0;
            }
            
            problems.newProblem(gameSet.getLevel());  //This will create a new problem after the correct answer was given.
            
            return true;
        }
        
        else
        {
            tries++;  //This increments the number of tries.
            
            if (tries > 1)  //This checks to see if the maximum amount of tries has been reached.
            {
                tries = 0;  //This resets the tries count.
                problems.newProblem(gameSet.getLevel());  //This creates a new problem after the maximum tries has bee reached.            
            }
            
            return true;
        }
    }
}
