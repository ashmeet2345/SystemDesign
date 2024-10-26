package SOLID.OpenClosed;

import SOLID.SingleResponsibility.Marker;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    //In open closed principle, we need to make class such that, it is open for extensions,
    //but closed for modifications. As our product is already tried and tested in production.
    //Making modifications might break the application, leading to product failure.
    //The best way to achieve this is to use interfaces and mention the new extensions in the interface itself.

}
