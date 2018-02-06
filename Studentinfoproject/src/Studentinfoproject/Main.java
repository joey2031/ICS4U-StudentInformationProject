package Studentinfoproject;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Student> studentsList = new ArrayList<Student>();
    static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    static ArrayList<Courses> courseList = new ArrayList<Courses>();
    static ArrayList<Locker> lockerList = new ArrayList<Locker>();

    public static void main(String[] args) {

        // preloaded courses
        Courses comSci = new Courses("Computer Science", "ICS 4U", "University", 12, 26, false);
        Courses broadcast = new Courses("Broadcast", "TGR 4m1", "Mixed", 12, 10, false);
        Courses religion = new Courses("Religion", "HRE 4M1", "Mixed", 12, 24, true); // just here for preloaded courses
        Courses spare = new Courses("spare", "N/A", "N/A", 12, 1, false);
        courseList.add(comSci);
        courseList.add(spare);
        courseList.add(religion);
        courseList.add(broadcast);

        //preloaded schedual
        Schedual s1 = new Schedual(spare, spare, spare, spare);

        // preloaded lockers
        Locker l1 = new Locker("1022, ", "90-90-23, ", "grey, ", "Art hall");
        Locker l2 = new Locker("1099, ", "32-43-12, ", "grey, ", "Math hall ");
        lockerList.add(l1);
        lockerList.add(l2);

        // preloaded students
        Student Joey = new Student("Billy", "bob", "james", "123 candy lane", "nuts", "NA", "mom and dad", "Male", 17, 12, 4, 5, 6, s1, l1);
        Student Seniow = new Student("joe", "gill", "justin", "Billy", "123 candy lane", "NA", "Santa", "Male", 1, 2, 4, 5, 6, s1, l2);
        studentsList.add(Joey);
        studentsList.add(Seniow);

        // Preloaded teachers
        Teacher G = new Teacher("Mr.G", "123-456-7890", "a.g@gmail.com", "Com si", 214, s1);
        Teacher N = new Teacher("Mr.N", "905-234-5423", "email@rmail.com", "Tech", 106, s1);
        Teacher M = new Teacher("Mr.h", "647-908-1234", "math@gmail.com", "Math", 213, s1);
        teacherList.add(G);
        teacherList.add(N);
        teacherList.add(M);

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("To ADD a new student enter, add. To VIEW a student enter view, to REMOVE a current student enter remove.");
            System.out.println("To create a new course enter +.");
            System.out.println("To update a students information enter: us");
            System.out.println("To add a teacher enter t. To view existing teachers enter vt");
            System.out.println("To remove a course, enter rc:");
            System.out.println("Search = s");
            String decesion = input.nextLine();
            if (decesion.equals("add")) {
                student();
                Locker();
                Schedual();

            }
            if (decesion.equals("remove")) {
                RemoveStudent(studentsList);
            }

            if (decesion.equals("view")) {
                Viewstudent(studentsList);

            }
            if (decesion.equals("+")) {
                Courses();

            }
            if (decesion.equals("t") || decesion.equals("T")) { // will go to whatever method based on decision.
                Teacher();

            }
            if (decesion.equals("vt") || decesion.equals("VT")) {
                Viewteach(teacherList);

            }
            if (decesion.equals("us")) {
                Updatestudent(studentsList);

            }
            if (decesion.equals("rc")) {
                RemoveCourse(courseList);

            }
            if (decesion.equals("s")) {
                search(studentsList);

            }

        }

    }

    public static void student() { // to add a student in the system
        Scanner info = new Scanner(System.in);
        Student student1 = new Student();

        System.out.println("Ok, what is the students?");
        System.out.println("First name:");
        student1.setFirstname(info.nextLine());

        System.out.println("Last name:");
        student1.setLastname(info.nextLine());

        System.out.println("Middle Name:");
        student1.setMiddlename(info.nextLine());

        System.out.println("Adress:");
        student1.setAdress(info.nextLine());

        System.out.println("Allergies:");
        student1.setAllergies(info.nextLine());

        System.out.println("Medical information:");
        student1.setMedicalinfo(info.nextLine());

        System.out.println("Name of the students parents or guradians:");
        student1.setParentorguardianname(info.nextLine());

        System.out.println("Gender:");
        student1.setGender(info.nextLine());

        System.out.println("Age:");
        student1.setAge(info.nextInt());

        System.out.println("Grade:");
        student1.setGrade(info.nextInt());

        System.out.println("Student number:");
        student1.setStudentnumber(info.nextInt());

        System.out.println("Parking spot (if they do not have on enter a -1)");
        student1.setParkingspot(info.nextInt());

        System.out.println("Number of community service hours.");
        student1.setServicehours(info.nextInt());

        studentsList.add(student1);

        // this was just to see if it works, u can remove it if u want
        System.out.println(student1.getAdress());
        System.out.println(student1.getAge());
        System.out.println(student1.getAllergies());
        System.out.println(student1.getFirstname());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student1.getLastname());
        System.out.println(student1.getMedicalinfo());
        System.out.println(student1.getMiddlename());
        System.out.println(student1.getParentorguardianname());
        System.out.println(student1.getParkingspot());
        System.out.println(student1.getServicehours());

    }

    public static void Locker() {  // to set up locler info 
        Scanner info = new Scanner(System.in);
        Locker locker1 = new Locker();
        System.out.println("Now lets set up the locker information");

        System.out.println("What colour lockers are in the school?");
        locker1.setColour(info.nextLine());

        System.out.println("what is the locker number?");
        locker1.setLocknumb(info.nextLine());

        System.out.println("what is the locker combo");
        locker1.setCombo(info.nextLine());

        System.out.println("Where is  the locker located. EG. art hall, math hall");
        locker1.setLocation(info.nextLine());

        lockerList.add(locker1);

    }

    public static void Courses() { //  To add a new offering in the school 
        Courses course1 = new Courses();
        Scanner info = new Scanner(System.in);
        System.out.println("Lets make a new Course!!");
        System.out.println(" ");

        System.out.println("What will be the name of this course?");
        course1.setName(info.nextLine());

        System.out.println("What will be the course code?");
        course1.setCourseCode(info.nextLine());

        System.out.println("What level will this course be, Eg. U, M, or C?");
        course1.setLevel(info.nextLine());

        System.out.println("What grade will this course be offerd in");
        course1.setGrade((info.nextInt()));

        System.out.println("What is the maxium ammount of studets alloend in this course.");
        course1.setMaxkids(info.nextInt());

        System.out.println("Is this a compulsery course (enter true or false)");
        course1.setIsCompulsery(info.nextBoolean());

        courseList.add(course1);

    }

    public static void Teacher() { // if a new teacher is being hired in the school
        Teacher teacher1 = new Teacher();
        Scanner teacher = new Scanner(System.in);

        System.out.println("What is the name of the new teacher?");
        teacher1.setName(teacher.nextLine());

        System.out.println("What is the teachers phone numer?");
        teacher1.setPhoneNumber(teacher.nextLine());

        System.out.println("What is the teachers email?");
        teacher1.setEmail(teacher.nextLine());

        System.out.println("What subject do they teach?");
        teacher1.setSubject(teacher.nextLine());

        teacherList.add(teacher1);

        System.out.println("Do you want to make the teachers schedual now?");

        String choice = teacher.nextLine();

        if (choice.equals("yes")) {
            for (int i = 0; i < courseList.size(); i++) {
                System.out.print(i + " - ");
                System.out.println(courseList.get(i));
            }

            System.out.println("What is the teachers schedual");
            Schedual Schedual = new Schedual();
            System.out.println("Please enter what this teacher has each period:");

            System.out.println("Period 1:");
            int num = teacher.nextInt();
            Schedual.setPeriod1(courseList.get(num));

            System.out.println("Period 2:");
            num = teacher.nextInt();
            Schedual.setPeriod2(courseList.get(num));

            System.out.println("Period 3:");
            num = teacher.nextInt();
            Schedual.setPeriod3(courseList.get(num));

            System.out.println("Period 4:");
            num = teacher.nextInt();
            Schedual.setPeriod4(courseList.get(num));
        }

    }

    public static void Schedual() {
        Scanner p = new Scanner(System.in);
        Schedual Schedual = new Schedual();
        for (int i = 0; i < courseList.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(courseList.get(i));
        }

        System.out.println("Please enter what this student has each period based on the number:");

        System.out.println("Period 1:");
        int num = p.nextInt();
        Schedual.setPeriod1(courseList.get(num));

        System.out.println("Period 2:");
        num = p.nextInt();
        Schedual.setPeriod2(courseList.get(num));

        System.out.println("Period 3:");
        num = p.nextInt();
        Schedual.setPeriod3(courseList.get(num));

        System.out.println("Period 4:");
        num = p.nextInt();
        Schedual.setPeriod4(courseList.get(num));

    }

    public static void Schedual(Schedual schedual) {
        Scanner p = new Scanner(System.in);
        for (int i = 0; i < courseList.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(courseList.get(i));
        }

        System.out.println("Please enter what this student has each period based on the number:");

        System.out.println("Period 1:");
        int num = p.nextInt();
        schedual.setPeriod1(courseList.get(num));

        System.out.println("Period 2:");
        num = p.nextInt();
        schedual.setPeriod2(courseList.get(num));

        System.out.println("Period 3:");
        num = p.nextInt();
        schedual.setPeriod3(courseList.get(num));

        System.out.println("Period 4:");
        num = p.nextInt();
        schedual.setPeriod4(courseList.get(num));

    }

    public static void Viewstudent(ArrayList<Student> list) {  // to view students in the school
        Scanner v = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(studentsList.get(i).getFirstname() + " " + studentsList.get(i).getLastname());
            // the student is stored in the list, so u get it through i, t and then the method.
        }
        System.out.println("");
        System.out.println("What student do you want to view? (Enter the index number)");
        int viewer = v.nextInt();
        list.get(viewer).viewStudent();

    }

    public static void ViewLocker(ArrayList<Locker> list) { // I never use this when im done we can look it over and decide if we take it out.
        Scanner l = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(lockerList.get(i).getLocknumb());
            // the locker is stored in the list, so u get it through i, t and then the method.
        }
        System.out.println("");
        System.out.println("What locker do you want to view? (Enter the index number)");
        int viewer = l.nextInt();
        list.get(viewer).viewLocker();

    }

    public static void Viewteach(ArrayList<Teacher> list) { // to view teachers in the school
        Scanner t = new Scanner(System.in);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(teacherList.get(i).getName());
            System.out.println("");
        }
        System.out.println("What Teacher do you want to view?");
        int viewer = t.nextInt();
        list.get(viewer).viewTeacher();

    }

    public static void RemoveStudent(ArrayList<Student> list) { // to remove students
        Scanner r = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(studentsList.get(i).getFirstname() + " " + studentsList.get(i).getLastname());
            // the student is stored in the list, so u get it through i, t and then the method.
        }
        System.out.println("What student do you want to remove? (Enter the index number)");
        int remover = r.nextInt();
        list.remove(remover);

    }

    public static void RemoveCourse(ArrayList<Courses> list) { // to remove students
        Scanner r = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(courseList.get(i));
            // the student is stored in the list, so u get it through i, t and then the method.
        }
        System.out.println("What course do you want to remove? (Enter the index number)");
        int remover = r.nextInt();
        list.remove(remover);

    }

    public static void Updatestudent(ArrayList<Student> list) { // courses will be done later courseList
        Scanner u = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(list.get(i).getFirstname() + " " + list.get(i).getLastname());
            // the student is stored in the list, so u get it through i, t and then the method.
        }
        System.out.println("What student do you want to update? (Enter the index number)");
        int index = u.nextInt();
        Student currentStudent = list.get(index);
        list.get(index).editStudent();
        System.out.println("What do you want to update: enter index number");
        index = u.nextInt();

        switch (index) { // to edit the students info
            case 0:
                System.out.println("Please enter the new student number:");
                int change = c.nextInt();
                currentStudent.setStudentnumber(change); // for this method
                break;

            case 1:
                System.out.println("Enter the names of the new pararents or guardians:");
                String Schange = s.nextLine();
                list.get(index).setParentorguardianname(Schange);
                break;

            case 2:
                System.out.println("Enter the students new address:");
                Schange = s.nextLine();
                list.get(index).setAdress(Schange);
                break;

            case 3:
                System.out.println("Enter the students new age:");
                change = c.nextInt();
                list.get(index).setAge(change);
                break;

            case 4:
                System.out.println("Enter the students allergies:");
                Schange = s.nextLine();
                list.get(index).setAllergies(Schange);
                break;

            case 5:
                System.out.println("Enter the grade the student is in:");
                change = c.nextInt();
                list.get(index).setGrade(change);
                break;


            case 6:
                System.out.println("Enter the new locker number");
                Schange = s.nextLine();
                currentStudent.getLocker().setLocknumb(Schange); // I FOUND OUT HOW TO DO THIS BY MYSELF!! YOU HAVE TO SET THE LOCKER LIST AS A PARAMATER
                break; // will work cux locker is in student class.

            case 7:
                System.out.println("Enter the new locker combination");
                //change = c.nextInt();
                Schange = s.nextLine();
                currentStudent.getLocker().setCombo(Schange); // I FOUND OUT HOW TO DO THIS BY MYSELF!! YOU HAVE TO SET THE LOCKER LIST AS A PARAMATER
                break;

            case 8:
                System.out.println("Enter the new locker location");
                Schange = s.nextLine();
                currentStudent.getLocker().setLocation(Schange); // I FOUND OUT HOW TO DO THIS BY MYSELF!! YOU HAVE TO SET THE LOCKER LIST AS A PARAMATER
                break;

            case 9:
                System.out.println("Enter any new medical information the student has:");
                Schange = s.nextLine();
                list.get(index).setMedicalinfo(Schange);
                break;

            case 10:
                System.out.println("Enter the students new parking spot:");
                change = c.nextInt();
                list.get(index).setParkingspot(change);
                break;

            case 11:
                Schedual(currentStudent.getSchedual());
                break;

            case 12:
                System.out.println("Enter the updated ammount of community service hours the student has:");
                change = c.nextInt();
                list.get(index).setServicehours(change);
                break;

            default:
                System.out.println("Enter a valid number");
                break;

        }

    }

    public static void Updatecourse(ArrayList<Courses> courseList) {
        for (int i = 0; i < courseList.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(courseList.get(i));
        }
        System.out.println("What course do you want to update");
        Scanner c = new Scanner(System.in);
        int index = c.nextInt();
        Courses currentCourse = courseList.get(index); // to et course based on input.
        currentCourse.editCourse();

        switch (index) {
            case 0:
                System.out.println("Enter the new name of the course: ");
                String change = c.nextLine();
                currentCourse.setName(change);

            case 1:
                System.out.println("New course code");
                change = c.nextLine();
                currentCourse.setCourseCode(change);

            case 2:
                System.out.println("New level of course (U, M, C ect...)");
                change = c.nextLine();
                currentCourse.setLevel(change);

            case 3:
                System.out.println("Set the new grad the coure is in");
                int numbC = c.nextInt();
                currentCourse.setGrade(numbC);
            case 4:
                System.out.println("New number of maxium kids:");
                numbC = c.nextInt();
                currentCourse.setMaxkids(numbC);

            case 5:
                System.out.println("Is compulsory:");
                change = c.nextLine();
                if (change.equals("true")) {
                    currentCourse.setIsCompulsery(true);

                } else {
                    currentCourse.setIsCompulsery(false);

                }

        }

    }

    public static void search(ArrayList<Student> list) {
        System.out.println("Enter the first name of the student:");
        Scanner s = new Scanner(System.in);
        String search = s.nextLine();

        for (int i = 0; i < list.size(); i++) {
        if (search.equalsIgnoreCase(studentsList.get(i).getFirstname()) || search.equalsIgnoreCase(studentsList.get(i).getLastname())) {
            System.out.println(studentsList.get(i).getFirstname() + " " + studentsList.get(i).getLastname());
            
            System.out.println("Do you want to see more information aboout this student? (yes or no)");
            search = s.nextLine();
            if ((search.equalsIgnoreCase("yes"))){
                list.get(i).viewStudent();
                 break;
            }
            
            
        } else if (list.size()-1 == i){
            System.out.println("That student does not exist.");
        }
    
 }
   

    }

}
