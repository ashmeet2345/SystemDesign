package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;
import CarRentalSystem.Product.VehicleType;

import java.util.List;
import java.util.stream.Collectors;

public class VehicleInventoryManagement {
    List<Vehicle> vehicleList;

    VehicleInventoryManagement(List<Vehicle> list){
        vehicleList=list;
    }

    public List<Vehicle> getAllVehicle(){
        return vehicleList;
    }

    public List<Vehicle> getVehicleOfType(VehicleType type){
        return vehicleList.stream().filter(vehicle -> vehicle.getType().equals(type)).collect(Collectors.toList());
    }

    public void addVehicleToList(Vehicle newVehicle){
        vehicleList.add(newVehicle);
    }
}
