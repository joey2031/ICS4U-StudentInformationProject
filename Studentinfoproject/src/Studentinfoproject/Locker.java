package Studentinfoproject;

public class Locker {

    private String locknumb, combo, colour, location;
    // id think we need a int.         

    public Locker() { // inital values
        colour = "Grey";
        combo = "";
        location = "";
        locknumb = "";

    }

    public Locker(String locknumb, String combo, String colour, String location) {
        this.locknumb = locknumb;
        this.combo = combo;
        this.colour = colour;
        this.location = location;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    

    public String getLocknumb() {
        return locknumb;
    }

    public void setLocknumb(String locknumb) {
        this.locknumb = locknumb;
    }

    @Override
    public String toString() {
        return locknumb + combo + location + colour; 
    }
    public void viewLocker(){
        System.out.println("The locker number is " + this.locknumb);
        System.out.println("The locker combo is " + this.combo);
        System.out.println("The location of the locker is " + this.location);
        System.out.println("The locker colour is " + this.colour);
    
    }
    public void changeLocker(){
         this.setLocknumb(locknumb);
         this.setCombo(combo);
         this.setLocation(location);
     
    
    }
    
    


}
