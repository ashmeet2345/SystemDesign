package SOLID.InterfaceSegmented;

public interface RestaurantEmployee {
    //This principle talks about that, the client should not implement the unnecessary function they do not need
    //In the below example, lets say a waiter class implements the interface, then wasDishes and cookFood
    //methods are not their function.
    //So to overcome this, break the interface into smaller functionalities



    void washDishes();
    void serveCustomers();
    void cookFood();
}
