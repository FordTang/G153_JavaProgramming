/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1p1_10;
import javax.swing.JOptionPane;

/**
 *
 * @author C02122472
 */
public class Chapter1p1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Hello, " + JOptionPane.showInputDialog("What is your name?") + "!";
        JOptionPane.showMessageDialog(null, (name));
        System.exit(0);
    }
}
