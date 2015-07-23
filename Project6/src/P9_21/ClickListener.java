/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P9_21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is an action listener that prints a message.
 * @author C02122472
 */
public class ClickListener implements ActionListener
{
    int count = 0;  //Keeps count of how many times clicked.
    String name;
    
    public ClickListener(String button)
    {
        name = button;
    }
    
    public void actionPerformed(ActionEvent event)
    {
        count++;
        System.out.println(name + " was clicked " + count + " times!");
    }
}
