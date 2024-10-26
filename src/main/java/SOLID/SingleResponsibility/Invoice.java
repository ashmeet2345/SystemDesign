package SOLID.SingleResponsibility;

public class Invoice {
    //Here it does not follow the principle of single responsibility as we might need to add some other functionalites
    //such as saving the data not only to db but to files as well.
    //So we need different classes for different functionalities

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    public float calculation(){
        float amount=marker.getPrice()*quantity;
        return amount;
    }

    public void saveToDb(){}
}
