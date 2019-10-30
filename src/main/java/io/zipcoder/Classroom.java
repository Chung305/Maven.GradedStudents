package io.zipcoder;

import java.util.ArrayList;

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

    public String[] getStudents() {
        ArrayList<String> output = new ArrayList<>();

        for(Student each : this.student){
            output.add("Student Name: " + each.getFirstName() + " " + each.getLastName() +
                    "\n > Average Score: " + each.getAverageExamScore() +
                    "\n > Exam Scores:\n" + each.getExamScores()) ;
        }
        String[] result = new String[output.size()];
        for(int i = 0; i < output.size(); i++){
            result[i] = output.get(i);
        }
        return result;

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

}
