package SOLID.LiskovSubstitution;

public class Vehicle {
    //Liskov substitution states that if we swap the object of child and parent classes, then the functionality should
    //not break.

    public int getNumberOfWheels(){
        return 2;
    }

    public boolean hasEngine(){
        return true;
    }
}
