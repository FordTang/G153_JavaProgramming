/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_15;

/**
 * This class creates the components of the Bull's Eye
 * @author Ford Tang - C02122472
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class BullsEye 
{
    private int xLeft;
    private int yTop;
    
    /*
     * Bull's Eye Constructor, sets coordinate of the Bull's Eye.
     */
    public BullsEye(int X, int Y)
    {
        xLeft = X;
        yTop = Y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double one = new Ellipse2D.Double(xLeft, yTop, 500, 500);
        Ellipse2D.Double two = new Ellipse2D.Double(xLeft + 50, yTop + 50, 400, 400);
        Ellipse2D.Double three = new Ellipse2D.Double(xLeft + 100, yTop + 100, 300, 300);
        Ellipse2D.Double four = new Ellipse2D.Double(xLeft + 150, yTop + 150, 200, 200);
        Ellipse2D.Double five = new Ellipse2D.Double(xLeft + 200, yTop + 200, 100, 100);
        
        g2.fill(one);
        
        g2.setColor(Color.WHITE);
        g2.fill(two);
        
        g2.setColor(Color.BLACK);
        g2.fill(three);
        
        g2.setColor(Color.WHITE);
        g2.fill(four);
        
        g2.setColor(Color.RED);
        g2.fill(five);
    }
}
