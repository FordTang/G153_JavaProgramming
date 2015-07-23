/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_7;

/**
 * This Car Class that calculates and returns fuel left in a tank of gas after a certain distance based on fuel efficiency.
 * @author Ford Tang - C02122472
 */
public class Car
{
    private int mpg;
    private int gasTank;
    private int distance;
    
    /*
     * Car Constructor, sets mpg efficiency and sets gas in tank to 0.
     */
    public Car(int mileage)
    {
        mpg = mileage;
        gasTank = 0;
    }
    
    /*
     * This adds fuel to the gas tank.
     */
    public void addGas(int gas)
    {
        gasTank = gas;
    }
    
    /*
     * This is the distance driven.
     */
    public void drive(int miles)
    {
        distance = miles;
    }
    
    /*
     * This returns the fuel left over in the gas tank after a certain distance driven.
     */
    public double getGasInTank()
    {
        return gasTank -= (distance/mpg);
    }
}
