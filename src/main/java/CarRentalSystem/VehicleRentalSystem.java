package CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;

    VehicleRentalSystem(List<Store> stores, List<User> users){
        this.stores=stores;
        this.users=users;
    }
}
