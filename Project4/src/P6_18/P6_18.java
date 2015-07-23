/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P6_18;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * This program will create random circles in a frame.
 * @author C02122472
 */
public class P6_18
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        String inputDialog;
        int amount;
        
        // TODO code application logic here
        frame.setSize(1280, 720);
        frame.setTitle("Random Circles");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JOptionPane.showMessageDialog(null, "This program will draw random circles in 720p!");
        inputDialog = JOptionPane.showInputDialog("Please enter how many circles you would like to draw?");
        amount = Integer.parseInt(inputDialog);
        
        DrawCircle circle = new DrawCircle(amount, (double)frame.getWidth(), (double)frame.getHeight());
        frame.add(circle);
        
        frame.setVisible(true);
    }
}
