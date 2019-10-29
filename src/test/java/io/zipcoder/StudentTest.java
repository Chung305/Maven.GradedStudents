package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    @Before
    public void setUp() throws Exception{
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getExamsScoresTest(){
        //Given
        String firstName = "Chung";
        String lastName = " Arguello";
        ArrayList<Double> examScore = new ArrayList<>();
        examScore.add(100.0);
        examScore.add(97.0);
        examScore.add(95.0);
        Student student = new Student(firstName, lastName, examScore);

        //When
        String output = student.getExamScores();

        //Then
        System.out.println(output);
    }
    @Test
    public void getNumberOfExamsTakenTest(){
        //Given
        String firstName = "Chung";
        String lastName = " Arguello";
        ArrayList<Double> examScore = new ArrayList<>();
        examScore.add(100.0);
        examScore.add(97.0);
        examScore.add(95.0);
        Student student = new Student(firstName, lastName, examScore);

        //When
        Integer expected = 3;

        //Then
        Assert.assertEquals(expected, student.getNumberOfExamsTaken());

    }
    @Test
    public void addExamScoreTest(){
        //Given
        String firstName = "Chung";
        String lastName = " Arguello";
        ArrayList<Double> examScore = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScore);

        //When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        //Then
        System.out.println(output);
    }
    @Test
    public void getFirstNameTest(){
        //Given
        String firstName = "Chung";
        String lastName = " Arguello";
        ArrayList<Double> examScore = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScore);

        //When
        String expected = firstName;

        //Then
        Assert.assertEquals(expected, student.getFirstName());
    }
    @Test
    public void getLastNameTest(){
        //Given
        String firstName = "Chung";
        String lastName = " Arguello";
        ArrayList<Double> examScore = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScore);

        //When
        String expected = lastName;

        //Then
        Assert.assertEquals(expected, student.getLastName());
    }
    @Test
    public void setExamScoreTest(){
        //Given
        String firstName = "Chung";
        String lastName = " Arguello";
        ArrayList<Double> examScore = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScore);
        student.addExamScore(97.0);

        //When
        student.setExamScores(1, 100.0);
        String output = student.getExamScores();

        //Then
        System.out.println(output);
    }
    @Test
    public void getAverageExamScoreTest(){
        //Given
        String firstName = "Chung";
        String lastName = " Arguello";
        ArrayList<Double> examScore = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScore);
        student.addExamScore(100.0);
        student.addExamScore(85.0);
        student.addExamScore(75.0);

        //When
        Double output = student.getAverageExamScore();

        //Then
        System.out.println(output);
    }
    @Test
    public void toStringTest(){
        //Given
        String firstName = "Chung";
        String lastName = " Arguello";
        ArrayList<Double> examScore = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScore);
        student.addExamScore(100.0);
        student.addExamScore(75.0);
        student.addExamScore(98.0);

        //when
        String output = student.toString();

        //Then
        System.out.println(output);
    }



}