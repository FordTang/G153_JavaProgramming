/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.math.MathContext;
import javax.swing.JComponent;

/**
 * 
 * @author C02122472
 */
public class Circle extends JComponent
{
    private double circle1;
    private double circle2;
    private double d;
    
    /*
     * Circle constructor, takes two float values for the two circles that will be created.
     */
    public Circle(float radius1, float radius2)
    {
        circle1 = radius1;
        circle2 = radius2;
        d = 100 * Math.sqrt(2);
    }
    
    public void paintComponent(Graphics g)
    {
        //Recovers Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        if (d < circle1 + circle2)
            g2.setColor(Color.GREEN);
        else
            g2.setColor(Color.RED);
        
        Ellipse2D.Double c1 = new Ellipse2D.Double(100 - circle1, 200 - circle1, 2 * circle1, 2 * circle1);
        Ellipse2D.Double c2 = new Ellipse2D.Double(200 - circle2, 100 - circle2, 2 * circle2, 2 * circle2);
                
        g2.fill(c1);
        g2.fill(c2);
    }
}
