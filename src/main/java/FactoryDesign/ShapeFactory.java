package FactoryDesign;

public class ShapeFactory {

    public Shape getShape(String shape){
        if(shape.toLowerCase().equals("circle")) return new Circle();
        else if(shape.toLowerCase().equals("square")) return new Circle();
        else if(shape.toLowerCase().equals("rectangle")) return new Circle();
        else return null;
    }

    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactory();
        Shape shapeObj=factory.getShape("circle");
        shapeObj.shape();

        //Factory method is used when we have to create objects which are based on some conditions

    }
}
