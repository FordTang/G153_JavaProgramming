/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P6_14;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * This program will find an approximate value for Pi through a series of random dart throws.
 * @author C02122472
 */
public class P6_14 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Random generator = new Random();
        double dartX, dartY, dartR, count, amount, hit;        
        String dialogInput;
        
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "This program will approximate a value for Pi through a series of random dart throws");
        dialogInput = JOptionPane.showInputDialog("Please enter the amount of throws");
        amount = Double.parseDouble(dialogInput);
        hit = 0;
        
        /*
         * This will generate as many simulated dart throws as requested from the input dialogue.
         */
        for (count = 0; count < amount; count++)
        {
            dartX = 2 * generator.nextDouble() - 1;  //This generates a random x-coordinate for the dart throw.
            dartY = 2 * generator.nextDouble() - 1;  //This generates a random y-coordinate for the dart throw.
            
            dartR = Math.sqrt(Math.pow(dartX, 2) + Math.pow(dartY, 2));  //By comparing the hypoteneuse of the dart throw versus the radius fo the circle, a hit can be determined.
            if (dartR <= 1)
                hit++;
            
            System.out.println("Dart Radius:  " + dartR);
        }
        
        JOptionPane.showMessageDialog(null, "4 * (" + hit + " / " + amount + ") = " + (4 * (hit/amount)));  //By comparing the amount of hits in the circle area against the area of the square, an approximate value of Pi will be found.
    }
}
