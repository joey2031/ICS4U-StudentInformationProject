package Studentinfoproject;

public class Student {
    // Ik you already did this for us but to practice ill start all over 
    // I have your file saved

    private String firstName, lastName, middleName, adress, allergies, medicalinfo, Parentorguardianname, gender; // first I made all the variables for this student
    private int age, grade, studentnumber, parkingspot, serviceHours; // privite because these variables are only for this class.
    private Schedual schedual;
    private Locker locker;

    public Student() {
        adress = "123 candylane";// constructor 
        age = 17;
        firstName = "Joey"; // THESE ARE ALL INITAL VALUES WHEN THERE ARE NO PARAMTERS.
        grade = 12;
        lastName = "Assal";
        middleName = "Billy";
        studentnumber = 1234023;
        parkingspot = 0;
        serviceHours = 0;
        allergies = "";
        medicalinfo = "";
        Parentorguardianname = "";
        gender = "";
        locker = new Locker();
        // This is all ANOTHER METHOD IN THE CLASS
        // you dont nedd thi cuz you can just set the values in the main class.
    }

    public Student(String firstName, String lastName, String middleName, String adress, String allergies, String medicalinfo, String Parentorguardianname, String gender, int age, int grade, int studentnumber, int parkingspot, int serviceHours, Schedual schedual, Locker locker) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.adress = adress;
        this.allergies = allergies;
        this.medicalinfo = medicalinfo;
        this.Parentorguardianname = Parentorguardianname;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.studentnumber = studentnumber;
        this.parkingspot = parkingspot;
        this.serviceHours = serviceHours;
        this.schedual = schedual;
        this.locker = locker;
    }

    public String getAdress() {
        return adress;
    }

    public String getFirstname() {  // since the variables are privite you need these methods to acess it throught the other class.
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getLastname() {
        return lastName;
    }

    // alll small methods to returne to the main 
    public int getServicehours() {
        return serviceHours;
    }

    public String getMiddlename() {
        return middleName;
    }

    public int getStudentnumber() {
        return studentnumber;
    }

    public int getParkingspot() {
        return parkingspot;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getMedicalinfo() {
        return medicalinfo;
    }

    public int getServiceHours() {
        return serviceHours;
    }

    public String getParentorguardianname() {
        return Parentorguardianname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setMedicalinfo(String medicalinfo) {
        this.medicalinfo = medicalinfo;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public void setParentorguardianname(String Parentorguardianname) {
        this.Parentorguardianname = Parentorguardianname;
    }

    public void setMiddlename(String middlename) {
        this.middleName = middlename;
    }

    public void setParkingspot(int parkingspot) {
        this.parkingspot = parkingspot;
    }

    public void setServicehours(int servicehours) {
        this.serviceHours = servicehours;
    }

    public void setStudentnumber(int studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSchedual(Schedual Schedual) { // not a STRING IT IS A SCEDUAL VARIABLE
        this.schedual = Schedual;

    }

    public Schedual getSchedual() {
        return this.schedual;

    }

    public Locker getLocker() {
        return this.locker; // this is getting the values for the variable 

    }

    public void setLocker(Locker locker) { // type and name
        this.locker = locker;

    }

    @Override
    public String toString() {
        return adress + " " + Parentorguardianname + " "  + allergies+ " " + firstName + " " + gender + " " + lastName + " " + medicalinfo + " " + middleName;
       
    }
    public void viewStudent() { // type and name
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Middle name: " + this.middleName);
        System.out.println("Student number: " + this.studentnumber);
        System.out.println ("Name of the studnts parents and guardians: " + this.Parentorguardianname);
        System.out.println("Adress: " + this.adress);
        System.out.println("Age: " + this.age);
        System.out.println("Allergies: "+ this.allergies);
        System.out.println("Gender: " + this.gender);
        System.out.println("Grade: " + this.grade);
        System.out.println("Locker Colour: " + locker.getColour());
        System.out.println("Locker Number: " + locker.getLocknumb());
        System.out.println("Locker combo: " + locker.getCombo());
        System.out.println("Locker location: " + locker.getLocation());
        System.out.println("Medical info: " + this.medicalinfo);
        System.out.println("Parking spot " + this.parkingspot);
        System.out.println("Schedual: " + this.schedual);
        System.out.println("Number of community service hours: " + this.serviceHours);


        
    }
    public void editStudent() { // type and name
        System.out.println("0- Student number: " + this.studentnumber);
        System.out.println ("1- Name of the studnts parents and guardians: " + this.Parentorguardianname);
        System.out.println("2- Adress: " + this.adress);
        System.out.println("3- Age: " + this.age);
        System.out.println("4- Allergies: "+ this.allergies);
        System.out.println("5- Grade: " + this.grade);
        System.out.println("6- Locker Number: " + locker.getLocknumb());
        System.out.println("7- Locker combo: " + locker.getCombo());
        System.out.println("8- Locker location: " + locker.getLocation());
        System.out.println("9- Medical info: " + this.medicalinfo);
        System.out.println("10- Parking spot " + this.parkingspot);
        System.out.println("11- Schedual: " + this.schedual);
        System.out.println("12- Number of community service hours: " + this.serviceHours);
 
    }
    

}
