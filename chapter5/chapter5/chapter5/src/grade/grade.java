/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

import javax.swing.JOptionPane;

/**
 *
 * @author C02122472
 */
public class grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String grade, stringInput;
        int score;
        
        stringInput = JOptionPane.showInputDialog(null, "Please Enter a Score:  ");
        
        score = Integer.parseInt(stringInput);
        
        if (score >= 90)
        {
            grade = "A";
        }
        
        else
        {
            if (score >= 80)
            {
                grade = "B";
            }
            else
            {
                if (score >= 70)
                {
                    grade = "C";
                }
                else
                {
                    if (score >= 60)
                    {
                        grade = "D";
                    }
                    else
                    {
                        grade = "F";
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Your grade is " + grade);
    }
}
