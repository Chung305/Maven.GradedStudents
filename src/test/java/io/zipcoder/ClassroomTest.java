package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClassroomTest {
    @Before
    public void setUp() throws Exception{

    }

    @After
    public void tearDown() throws Exception{

    }
    @Test
    public void getAverageExamScoreTest(){

        ArrayList<Double> s1Scores = new ArrayList<>();
        s1Scores.add(100.0); s1Scores.add(150.0);
        ArrayList<Double> s2Scores = new ArrayList<>();
        s2Scores.add(225.0); s2Scores.add(25.0);

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[]{s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudentTest(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0); examScores.add(150.0); examScores.add(250.0); examScores.add(0.0);
        Student student = new Student("Leon", "Hunter", examScores);

        // When

        classroom.addStudent(student);
        Student expected = classroom.getStudents();

        // Then
        Assert.assertEquals(expected, classroom.getStudents());

    }
    @Test
    public void removeStudentTest(){
        int numberOfStudentExpected = 0;
        Classroom classroom =  new Classroom(1);
        ArrayList<Double> exams = new ArrayList<>();
        exams.add(155.0);
        Student student = new Student("chung", "Arguello", exams);

        classroom.addStudent(student);

        classroom.removeStudent("chung", "Arguello");

        //then
        Assert.assertEquals(numberOfStudentExpected, classroom.getNumberOfStudents());


    }
}
