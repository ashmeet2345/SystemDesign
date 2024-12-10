package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;
import CarRentalSystem.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement inventory;
    Location storeLocation;
    List<Reservation> reservations=new ArrayList<>();

    Store(List<Vehicle> vehicle, Location location){
        inventory=new VehicleInventoryManagement(vehicle);
        this.storeLocation=location;
    }

    public List<Vehicle> getVehicles(){
       return inventory.getAllVehicle();
    }

    public List<Vehicle> getSpecificVehicle(VehicleType type){
        return inventory.getVehicleOfType(type);
    }

    public Reservation createReservation(User user, Vehicle vehicle ){
        Reservation reservation=new Reservation();
        int id=reservation.createReservation(user,vehicle);
        return reservation;
    }

}
