/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_3;
import java.util.Scanner;

/**
 * This program will take 3 floating point numbers and arrange them from smallest to largest by value.
 * @author C02122472
 */
public class p5_3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        float a, b, c;
        Scanner in;
        
        // TODO code application logic here
        in = new Scanner(System.in);
        System.out.println("This program will sort three floating point numbers from smallest to largest.");
        System.out.println("Please enter the first floating point number:");
        a = in.nextFloat();
        
        System.out.println("Please enter the second floating point number:");
        b = in.nextFloat();
        
        System.out.println("Please enter the third floating point number:");
        c = in.nextFloat();
        
        if (a > b && b > c)      
            System.out.println("The order is:  " + c + ", " + b + ", " + a);
        else if (b > a && a > c)
            System.out.println("The order is:  " + c + ", " + a + ", " + b);
        else if (c > a && a > b)
            System.out.println("The oder is:  " + b + ", " + a + ", " + c);
        else if (a > c && c > b)
            System.out.println("The order is:  " + b + ", " + c + ", " + a);
        else if (c > b && b > a)
            System.out.println("The order is:  " + a + ", " + b + ", " + c);
        else if (b > c && c > a)
            System.out.println("The order is:  " + a + ", " + c + ", " + b);
    }
}
