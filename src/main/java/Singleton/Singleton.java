package Singleton;

public class Singleton {
    private String name;
    private static Singleton instance;

    private Singleton(String name){
        this.name=name;
    }

    public static synchronized Singleton getInstance(String name){
        if(instance==null){
            instance=new Singleton(name);
        }
        return instance;
    }
    public void getHashcode(){
        System.out.println("Hashcode of singleton instance: "+instance);
        System.out.println("Name: "+name);
    }
}
