/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_8;

/**
 * This Class adds a students quiz scores and returns the total and average of the total score.
 * @author Ford Tang - C02122472
 */
public class Student
{
    private String name;
    private int score;
    private int quizAmmount;
    private float average;
    
    /*
     * Student constructor, sets the student name and sets the score and ammounts of quizzes to 0.
     */
    public Student(String student)
    {
        name = student;
        score = 0;
        quizAmmount = 0;
    }
    
    /*
     * This returns the student name.
     */
    public String getName()
    {
        return name;
    }
    
    /*
     * This adds quiz scores to the total and tallies the number of quizzes.
     */
    public void addQuiz(int quiz)
    {
        score += quiz;
        quizAmmount = quizAmmount + 1;
    }
    
    /*
     * This returns the total score of the student.
     */
    public int getTotalScore()
    {
        return score;
    }
    
    /*
     * This returns the calculated average score of the student.
     */
    public float getAverageScore()
    {
        return average = (float)score/quizAmmount;
    }
}
