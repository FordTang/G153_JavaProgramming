/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_20;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author C02122472
 */
public class p5_20 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String stringInput1, stringInput2;
        Circle circleCheck;
        JFrame frame;
        
        // TODO code application logic here
        stringInput1 = JOptionPane.showInputDialog(null, "Please enter the radius of the first circle:");
        
        stringInput2 = JOptionPane.showInputDialog(null, "Please enter the radius of the second circle:");
        
        circleCheck = new Circle(Float.parseFloat(stringInput1), Float.parseFloat(stringInput2));
        
        frame = new JFrame();
        
        frame.setSize(500, 500);
        frame.setTitle("Circle Check");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(circleCheck);
        
        frame.setVisible(true);
    }
}
