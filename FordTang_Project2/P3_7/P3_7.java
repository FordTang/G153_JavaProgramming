/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_7;

/**
 * 
 * @author Ford Tang - C02122472
 */
public class P3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Car myHybrid = new Car(50); // 50 miles per gallon
        myHybrid.addGas(20); // Tank 20 gallons
        myHybrid.drive(100); // Drive 100 miles
        double gasLeft = myHybrid.getGasInTank(); //Get gas remaining in tank
        System.out.println(gasLeft);
        System.out.println("expected: 18");
    }
}
