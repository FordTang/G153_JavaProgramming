/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P9_28;

import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This program will output the time every 1 second to the console.
 * @author C02122472
 */
public class Main
{
    private static final int FRAME_WIDTH = 0;
    private static final int FRAME_HEIGHT = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        JFrame frame = new JFrame();
        /*
        JPanel panel = new JPanel();
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        panel.add(startButton);
        panel.add(stopButton);
        frame.add(panel);
        */
        ActionListener listener = new MyListener();
        Timer repeat = new Timer(1000, listener);
        repeat.start();
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
