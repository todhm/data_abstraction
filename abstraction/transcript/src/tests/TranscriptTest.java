package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TranscriptTest {

    private Transcript testTranscript;
    private ArrayList<String> courseList;
    private ArrayList<Double> gradeList;
    @Before
    public void setUp(){
        testTranscript = new Transcript("Student Name", 1000);
        courseList     = new ArrayList<String>();
        gradeList      = new ArrayList<Double>();
        //TODO: write new values in testTranscript constructor
    }


    //Require:gradeList should be not empty.
    //Require

    public void addGradeAndCheck(String course,double grade ){
        testTranscript.addGrade(course,grade);
        courseList.add(course);
        gradeList.add(grade);
        assertEquals(testTranscript.getAllCourse(),courseList);
        assertEquals(testTranscript.getAllGrade(),gradeList);
    }

    //TODO: Test to check if grade set Properly when list is empty.
    @Test
    public void testWithEmptyGrade(){
        addGradeAndCheck("CS-202",4);
    }

    //TODO: Test to check if there is variable in List if the grade is not Empty.
    @Test
    public void testWithGrade(){
        addGradeAndCheck("CS-202",4.0);
        assertEquals(testTranscript.getGPA(),4.0,0.0);
        addGradeAndCheck("CS-203",3.7);
        assertEquals(testTranscript.getGPA(),3.85,0.0);

    }

    @Test
    public void testCourseAndGradeName(){
        addGradeAndCheck("CS-202",4);
        assertEquals(testTranscript.getCourseAndGrade("CS-202"),"CS-202 4.0");
    }

    @Test
    public void testGeadeOfCourse(){
        addGradeAndCheck("CS-202",4);
        assertEquals(testTranscript.getGradebyCourse("CS-202"),4.0,0.0);
        addGradeAndCheck("CS-203",3.7);
        assertEquals(testTranscript.getGradebyCourse("CS-203"),3.7,0.0);



    }
}
