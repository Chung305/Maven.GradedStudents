package io.zipcoder;

import java.util.ArrayList;

public class Classroom {
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

    public Student[] getStudent() {
        return student;
    }

    public void getAverageExamScores(){
        
    }

}
