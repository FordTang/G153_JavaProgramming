/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_15;

/**
 * This class draws the Bull's Eye on the screen.
 * @author Ford Tang - C02122472
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class BullsEyeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        BullsEye be = new BullsEye(10,10);
        
        be.draw(g2);
    }
}
