/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_8;

/**
 * 
 * @author Ford Tang - C02122472
 */
public class P3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Student student1 = new Student("Ford"); // Student - Ford
        student1.addQuiz(9); // quiz with a score of 9
        student1.addQuiz(7); // quiz with a score of 7
        student1.addQuiz(3); // quiz with a score of 3
        
        Student student2 = new Student("Sandy"); // Student - Sandy
        student2.addQuiz(10); // quiz with a score of 10
        student2.addQuiz(8); // quiz with a score of 8
        student2.addQuiz(6); // quiz with a score of 6
        
        System.out.println(student1.getName());
        System.out.println(student1.getTotalScore());
        System.out.println(student1.getAverageScore());
        
        System.out.println("");
        
        System.out.println(student2.getName());
        System.out.println(student2.getTotalScore());
        System.out.println(student2.getAverageScore());
    }
}
