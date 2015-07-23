/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_15;

/**
 *
 * @author Ford Tang - C02122472
 */

import javax.swing.JFrame;

public class BullsEyeViewer 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        JFrame frame = new JFrame();
        
        frame.setSize(540, 560);
        frame.setTitle("Bull's Eye");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BullsEyeComponent component = new BullsEyeComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
