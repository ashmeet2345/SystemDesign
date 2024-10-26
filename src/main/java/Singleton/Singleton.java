package Singleton;

public class Singleton implements Cloneable{
    private static Singleton instance;

    private Singleton(){
    }

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void getHashcode(){
        System.out.println("Hashcode of singleton instance: "+instance);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
