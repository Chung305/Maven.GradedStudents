package io.zipcoder;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student (String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getExamScores(){
        String output = "";
        Integer examNumber = 1;

        for(Double i : examScores){
            output += "Exam " + examNumber++ + " -> " + i + "\n";
        }
        return output;
    }

    public Integer getNumberOfExamsTaken(){
        Integer numberOfExams = 0;

        for(Double i : examScores){
            numberOfExams++;
        }
        return numberOfExams;
    }

    public void addExamScore(Double examScore){
        this.examScores.add(examScore);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setExamScores(int examNumber, Double newScore){
        this.examScores.set(examNumber-1, newScore);
    }

    public Double getAverageExamScore(){
        Double average = 0.0;

        for(Double i : examScores){
            average += i;
        }
        average = (double) Math.round(((average/getNumberOfExamsTaken())* 100.0) / 100.0);
        return average;
    }

    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName +
                "\n > Average Score: " + getAverageExamScore() +
                "\n > Exam Scores:\n" + getExamScores();
    }
}
