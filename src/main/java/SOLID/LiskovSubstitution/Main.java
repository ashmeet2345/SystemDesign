package SOLID.LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new Motorcycle());
        vehicles.add(new Car());

        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle.hasEngine());
        }
    }
}
