/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_13;

/**
 * This class will reverse the order of integers inputed.
 * @author Ford Tang - C02122472
 */
public class DigitExtractor 
{
    int input;
    int digit;
    
    /*
     * The constructor will take an input, ready to be reversed.
     */
    public DigitExtractor(int anInteger)
            {
                input = anInteger;
            }
    
    /*
     * This method returns the next digit in the integer.
     */
    public int nextDigit()
    {
        digit = input % 10;
        input = input / 10;
        return digit;
    }
}