
package Studentinfoproject;


public class Teacher {
    
    private String name, phoneNumber, email, subject;
    int roomNumber;
    Schedual teacherSchedual;

    public Teacher() {
    }

    public Teacher(String name, String phoneNumber, String email, String subject, int roomNumber, Schedual teacherSchedual) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.subject = subject;
        this.roomNumber = roomNumber;
        this.teacherSchedual = teacherSchedual;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getSubject() {
        return subject;
    }

    public Schedual getTeacherSchedual() {
        return teacherSchedual;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeacherSchedual(Schedual teacherSchedual) {
        this.teacherSchedual = teacherSchedual;
    }

    @Override
    public String toString() {
        return name+ " " + phoneNumber + " "+ email + " " +  subject;
    }
    
    
    
     public void viewTeacher() { 
      System.out.println("Name: " + this.name);
         System.out.println("Phone number " + this.phoneNumber); 
         System.out.println("Email: " + this.email);
         System.out.println("Subject " + this.subject); 
         System.out.println("Room number " + this.roomNumber);
         System.out.println("Schedual " + this.teacherSchedual );
     
     
     
     
     }
    
    
    
    
}
