package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom{
    private Student[] student;

    public Classroom(){
        this.student = new Student[30];
    }
    public Classroom(Integer maxSize){
        this.student = new Student[maxSize];
    }

    public Classroom(Student[] student){
        this.student = student;
    }

    public Student[] getStudents() {

        return student;
    }

    public Double getAverageExamScores(){
        Double totalExamScores = 0.0;
        Double numberOfExams = 0.0;

        for(Student i : student){
            totalExamScores += i.getAverageExamScore();
            numberOfExams++;
        }
        Double average = (double)Math.round(((totalExamScores/numberOfExams) * 100) / 100);

        return average;
    }

    public void addStudent(Student student){
        for(int i = 0; i < this.student.length; i++){
            if(this.student[i] == null){
                this.student[i] = student;
            }
        }
    }

}
