package NullObjectDesignPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle=VehicleFactory.getVehicleObject("1");
        printVehicle(vehicle);
    }

    public static void printVehicle(Vehicle vehicle){
        System.out.println("Seating capacity: "+vehicle.getSeatingCapacity());
        System.out.println("Tank capacity: "+vehicle.getTankCapacity());
    }

}
