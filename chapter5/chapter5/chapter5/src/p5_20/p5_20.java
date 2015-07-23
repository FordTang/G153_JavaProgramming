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
        String stringInput;
        Circle circleOne, circleTwo;
        
        // TODO code application logic here
        stringInput = JOptionPane.showInputDialog(null, "Please enter the radius of the first circle:");
        
        circleOne = new Circle(Float.parseFloat(stringInput), 100, 200);
        
        stringInput = JOptionPane.showInputDialog(null, "Please enter the radius of the second circle:");
        
        circleTwo = new Circle(Float.parseFloat(stringInput), 200, 100);
        
    }
}
