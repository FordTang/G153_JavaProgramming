/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P9_28;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * This will output the current date and time on every call.
 * @author C02122472
 */
public class MyListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        Date now = new Date();
        System.out.println(now);
    }
}
