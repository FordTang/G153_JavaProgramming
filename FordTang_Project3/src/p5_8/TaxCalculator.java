/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_8;

/**
 * 
 * @author C02122472
 */
public class TaxCalculator 
{
    private static final double rate1 = 0.01;
    private static final double rate2 = 0.02;
    private static final double rate3 = 0.03;
    private static final double rate4 = 0.04;
    private static final double rate5 = 0.05;
    private static final double rate6 = 0.06;
    private static final double rate1_limit = 50000;
    private static final double rate2_limit = 75000;
    private static final double rate3_limit = 100000;
    private static final double rate4_limit = 250000;
    private static final double rate5_limit = 500000;
    
    double amount;
    double tax;
    double taxableAmount;
    
    /*
     * Constructor will receive the income and reset the tax and taxable amount variables to 0.
     */
    public TaxCalculator(double income)
    {
        amount = income;
        tax = 0;
    }
    
    /*
     * This method will calculate tax and return the amount.
     */
    public double getTax()
    {
        if (amount > rate5_limit)
        {
            tax += (amount - rate5_limit) * rate6;
            amount = rate5_limit;
        }
        
        if (amount > rate4_limit)
        {
            tax += (amount - rate4_limit) * rate5;
            amount = rate4_limit;           
        }
        
        if (amount > rate3_limit)
        {
            tax += (amount - rate3_limit) * rate4;
            amount = rate3_limit;
        }
        
        if (amount > rate2_limit)
        {
            tax += (amount - rate2_limit) * rate3;
            amount = rate2_limit;
        }
        
        if (amount > rate1_limit)
        {
            tax += (amount - rate1_limit) * rate2;
            amount = rate1_limit;
        }
        
        if (amount <= rate1_limit)
        {
            tax += amount * rate1;
        }
        
        return tax;
    }
}
