package model;

import java.util.ArrayList;


/**
 * INVARIANT: course list and grade list are the same size
 * each course has a grade associated, and vice versa, at matching indices
 */

public class Transcript {

    private String StudentName;
    private int StudentID;
    private ArrayList<String> courseList;
    private ArrayList<Double> gradeList;


    //Constructor.
    //
    public Transcript(String studentName, int studentID){
        StudentName = studentName;
        StudentID = studentID;
        courseList = new ArrayList<>();
        gradeList = new ArrayList<>();

    }




    //Require grade is the number in 4.0,3.7.3.5,3.3,3.0,2.7 ~~0,
    //Modifies: this
    //Effects: write grade of course if it exists else do nothing.
    public void addGrade(String course, double grade){
        courseList.add(course);
        gradeList.add(grade);

    }




    //REQUIRES: a course the student has already taken.
    //Effects. get course name and it's grade if there is matching course
    //else return null;
    public String getCourseAndGrade(String course){
        if(courseList.contains(course)){
            int index = courseList.indexOf(course);
            String courseAndGrade = courseList.get(index) + " " +gradeList.get(index).toString();
            return courseAndGrade;
        }
        else{
            return null;
        }
    }




    //Effects: return list of all the course.
    public ArrayList<String> getAllCourse(){
        return courseList;
    }

    //Effects: return list of all the grade.
    public ArrayList<Double> getAllGrade(){
        return gradeList;
    }


    //Requires : there is more than 1 course that is graded.
    //Effects: get GPA of entire classes.
    public double calculateGPA(ArrayList<Double> selectedGrades){
        double sum = 0 ;

        for(int i = 0 ; i < selectedGrades.size(); i++){
            sum += selectedGrades.get(i);
        }
        double gpa =  sum / selectedGrades.size();
        return gpa ;
    }


    public double getGPA(){ return calculateGPA(gradeList); }


    //Requires courseList should contains argument Course.
    //Effects return the grade of selected course.
    public double getGradebyCourse(String Course){
        if(courseList.contains(Course)){
            int index = courseList.indexOf(Course);
            return gradeList.get(index);
        }
        else{
            return 0.0;
        }

    }

    //Effects: return GPA of selected courses.
    public double getAverageOverSelectedCourses(ArrayList<String> selectedCourses){
        return 0.0;
        //think about which method you can call as a helper!
    }




    //Effect return name of student.
    public String getStudentName(){return StudentName;}



    //Effects print the Transcript;
    public void printTranscript(){
        String transcript = "";
        transcript += StudentName;
        transcript += ": ";
        for(String course : courseList){
            transcript += getCourseAndGrade(course);
            transcript += ": ,";

        }
        transcript += "\n";
        transcript += "GPA: ";
        transcript += String.valueOf(getGPA());
        System.out.println(transcript);
    }









}
