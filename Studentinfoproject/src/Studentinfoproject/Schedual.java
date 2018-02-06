package Studentinfoproject;

public class Schedual {

    private Courses period1;
    private Courses period2;
    private Courses period3;
    private Courses period4;

    public Schedual() {
    }

    public Schedual(Courses period1, Courses period2, Courses period3, Courses period4) {
        this.period1 = period1;
        this.period2 = period2;
        this.period3 = period3;
        this.period4 = period4;
    }

    public Courses getPeriod1() {
        return period1;
    }

    public void setPeriod1(Courses period1) {
        this.period1 = period1;
    }

    public Courses getPeriod2() {
        return period2;
    }

    public void setPeriod2(Courses period2) {
        this.period2 = period2;
    }

    public Courses getPeriod3() {
        return period3;
    }

    public void setPeriod3(Courses period3) {
        this.period3 = period3;
    }

    public Courses getPeriod4() {
        return period4;
    }

    public void setPeriod4(Courses period4) {
        this.period4 = period4;
    }
    

    @Override
    public String toString() {
        return " " + period1 + " " + period2 + " " + period3 + " " + period4;
    }
    public void viewSchedua(){
        System.out.println("Period 1 " + this.period1);
        System.out.println("Period 2 " + this.period2);
        System.out.println("Period 3 " + this.period3);
        System.out.println("Period 4 " + this.period4);

}
    

}
