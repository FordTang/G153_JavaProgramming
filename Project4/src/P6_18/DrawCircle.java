/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P6_18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.util.Random;
import java.text.DecimalFormat;

/**
 *
 * @author C02122472
 */
public class DrawCircle extends JComponent
{
    Random generator = new Random();    
    double x, y, randomX, randomY, radius;
    int count, amount, randomColor, randomFill;
    DecimalFormat df = new DecimalFormat("##.##");
            
    
    public DrawCircle(int times, double width, double height)
    {
        amount = times;
        x = width - 105; //Reduced Width to accomodate circle information.
        y = height - 65; //Reduced Height to accomodate circle information.
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
                
        for (count = 0; count < amount; count++)
        {
            randomX = generator.nextDouble() * x; //Random x-coordinate for upperleft corner of circle.
            randomY = generator.nextDouble() * y; //Random y-coordinate for upperleft corner of circle.
            randomColor = generator.nextInt(12); //Random integer to determine color.
            randomFill = generator.nextInt(2); //Random integer to determine draw method.
            
            if (randomX > x - 10) //If x-coordinate is too large, this will reduce it by 10.
                randomX -= 10;
            if (randomY > y - 10) //If y-coordinate is too large, this will reduce it by 10.
                randomY -= 10;
            
            if ((x - randomX) <= (y - randomY))  //This will determine how large the radius can be and will pick a random length.
                radius = (generator.nextDouble() * (x - randomX))/2;
            else
                radius = (generator.nextDouble() * (y - randomY))/2;
            
            if (radius < 5) //If the radius length is too small, this will set it to 5.
                radius = 5;
                        
            if (randomColor == 0)  //This sets the color depending of the randomColor integer.
                g2.setColor(Color.BLUE);
            else if (randomColor == 1)
                g2.setColor(Color.CYAN);
            else if (randomColor == 2)
                g2.setColor(Color.DARK_GRAY);
            else if (randomColor == 3)
                g2.setColor(Color.GRAY);
            else if (randomColor == 4)
                g2.setColor(Color.GREEN);
            else if (randomColor == 5)
                g2.setColor(Color.LIGHT_GRAY);
            else if (randomColor == 6)
                g2.setColor(Color.MAGENTA);
            else if (randomColor == 7)
                g2.setColor(Color.ORANGE);
            else if (randomColor == 8)
                g2.setColor(Color.PINK);
            else if (randomColor == 9)
                g2.setColor(Color.RED);
            else if (randomColor == 10)
                g2.setColor(Color.WHITE);
            else
                g2.setColor(Color.YELLOW);
            
            Ellipse2D.Double circle = new Ellipse2D.Double(randomX, randomY, radius * 2, radius * 2);  //This determines the circle.
            
            if (randomFill == 1) //If RandomFill returned with a value of 1, the circle will be filled with color.
            {
                g2.fill(circle);
                g2.drawString("(" + df.format(randomX + radius) + ", " + df.format(randomY + radius) + ")", (float)(randomX), (float)((randomY + radius * 2) + 12));
                g2.drawString("Radius:  " + df.format(radius), (float)(randomX), (float)((randomY + radius * 2) + 24));
            }
            else //If RandomFill returned with a 0 value, only the circumference of the circle will be drawn.
            {
                g2.draw(circle);
                g2.drawString("(" + df.format(randomX + radius) + ", " + df.format(randomY + radius) + ")", (float)(randomX), (float)((randomY + radius * 2) + 12));
                g2.drawString("Radius:  " + df.format(radius), (float)(randomX), (float)((randomY + radius * 2) + 24));
            }
        }
    }
}
