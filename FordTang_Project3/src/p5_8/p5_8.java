/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_8;

import javax.swing.JOptionPane;

/**
 *
 * @author C02122472
 */
public class p5_8 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String consoleInput;
        double income;
        TaxCalculator tax;
        
        // TODO code application logic here
        consoleInput = JOptionPane.showInputDialog(null, "Please enter the Income Amount:");
        income = Double.parseDouble(consoleInput);
        
        tax = new TaxCalculator(income);
        
        JOptionPane.showMessageDialog(null, "The Tax Amount is $" + tax.getTax());
    }
}
