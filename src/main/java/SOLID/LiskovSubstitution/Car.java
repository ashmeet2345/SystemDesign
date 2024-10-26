package SOLID.LiskovSubstitution;

public class Car extends Vehicle{

    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}
