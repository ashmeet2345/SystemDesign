package SOLID.SingleResponsibility;

public class Marker {
    //Single responsibility means, that a class has only 1 reason to change
    private int id;
    private String name;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Marker(int id, String name, float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
