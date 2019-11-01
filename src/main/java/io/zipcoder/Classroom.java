package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

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

    public Student getStudents() {

        for(Student each : student){
            if(each!= null)
                return each;
        }

        return  null;

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
        ArrayList<Student> output = new ArrayList<>();

        output.add(student);

        Student[] result = new Student[output.size()];
        for(int i = 0; i < output.size(); i++){
            result[i] = output.get(i);
        }
    }

    public void removeStudent(String firsName, String lastName){
        ArrayList<Student> student = new ArrayList<>();
        Collections.addAll(student, this.student);
        for(Student each : student){
            if(each.getFirstName().equals(firsName) && each.getLastName().equals(lastName))
                student.remove(each);
        }
        this.student = new Student[student.size()];
        for(int i = 0; i < student.size(); i++){
            this.student[i] = student.get(i);
        }
    }

    public int getNumberOfStudents(){
        return this.student.length;
    }


}
