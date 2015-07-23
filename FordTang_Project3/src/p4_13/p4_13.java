/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_13;
import javax.swing.JOptionPane;

/**
 * This program will test the DigitExtractor class, which will return digit order.
 * @author Ford Tang - C02122472
 */
public class p4_13 
{
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String consoleInput;
        int number;
        int digitAmount;
        DigitExtractor numberTest;
        int times;
        
        // TODO code application logic here
        consoleInput = JOptionPane.showInputDialog(null, "Please enter a number:");
        number = Integer.parseInt(consoleInput);
        
        numberTest = new DigitExtractor(number);
        
        digitAmount = consoleInput.length();
        
        System.out.print("The number in reverse is: ");
        for (times = 0; times < digitAmount; times++)
        {
            System.out.print(" " + numberTest.nextDigit());
        }
        
        System.out.println("");
    }
}
