/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P9_21;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author C02122472
 */
public class Main
{
    private static final int FRAME_WIDTH = 150;
    private static final int FRAME_HEIGHT = 105;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {        
        // TODO code application logic here
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Click me!");
        JButton button2 = new JButton("Click me, also!");
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        
        ActionListener listener1 = new ClickListener("Button 1");
        ActionListener listener2 = new ClickListener("Button 2");
        button1.addActionListener(listener1);
        button2.addActionListener(listener2);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
