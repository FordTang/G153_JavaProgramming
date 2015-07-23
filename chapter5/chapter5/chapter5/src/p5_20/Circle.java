/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_20;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
 * 
 * @author C02122472
 */
public class Circle 
{
    private float circle1;
    private float xLeft;
    private float yTop;
    
    /*
     * Circle constructor, takes two float values for the two circles that will be created.
     */
    public Circle(float radius, float x, float y)
    {
        circle1 = radius;
        xLeft = x;
        yTop = y;
    }
    
    public boolean intersects(Circle other)
    {
        if (circle1 + other.circle1 < 100)
            return true;
        else
            return false;
    }
    
    public void draw(Graphics2D g)
    {
        Ellipse2D.Float c1 = new Ellipse2D.Float(xLeft, yTop, circle1, circle1);
        
        
        g.fill(c1);
    }
}
