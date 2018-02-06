package Studentinfoproject;

import java.util.ArrayList;

public class Courses {

    private String name;
    private String courseCode;
    private String level;
    private int grade, maxkids;
    private boolean isCompulsery;
    private ArrayList<Courses> Prerequsites;
    private ArrayList<Teacher> teachers; // this will assign the teachers, the teachers class makes them 
    // this connects the two classes

    public Courses() {
        name = "";
        courseCode = "";
        level = "";
        grade = 0;
        maxkids = 0;
        isCompulsery = false;
        Prerequsites = new ArrayList<Courses>();
        teachers = new ArrayList<Teacher>();

    }

    public Courses(String name, String courseCode, String level, int grade, int maxkids, boolean isCompulsery) {
        this.name = name;
        this.courseCode = courseCode;
        this.level = level;
        this.grade = grade;
        this.maxkids = maxkids;
        this.isCompulsery = isCompulsery;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public int getGrade() {
        return grade;
    }

    public String getLevel() {
        return level;
    }

    public ArrayList<Courses> getPrerequsites() {
        return Prerequsites;
    }

    public String getName() {
        return name;
    }

    public boolean isIsCompulsery() {
        return isCompulsery;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setLevel(String level) { // the set methods are to set a value for the variable
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsCompulsery(boolean isCompulsery) {
        this.isCompulsery = isCompulsery;
    }

    public void setPrerequsites(ArrayList<Courses> Prerequsites) {
        this.Prerequsites = Prerequsites;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public int getMaxkids() {
        return maxkids;
    }

    public void setMaxkids(int maxkids) {
        this.maxkids = maxkids;
    }

    @Override
    public String toString() {
        return name;
    }
    

        public void editCourse() { // method to edit course
        System.out.println("0- Course name: " + this.name);
        System.out.println ("1-Course code: " + this.courseCode);
        System.out.println("2- Level: " + this.level);
        System.out.println("3- Grade: " + this.grade);
        System.out.println("4- Max kids: "+ this.maxkids);
        System.out.println("5- Grade: " + this.grade);
        System.out.println("6- is it compulsery " + this.isCompulsery);
        System.out.println("7- Prerequsites: " + this.Prerequsites);
        System.out.println("8- Teachers: " + this.teachers);
    }

}
