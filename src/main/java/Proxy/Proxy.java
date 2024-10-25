package Proxy;

public class Proxy extends Real{
    public void method2(String name){
        if(name.equalsIgnoreCase("Ashmeet")){
            super.method();
        } else {
            System.out.println("Authentication failed");
        }

    }
}
