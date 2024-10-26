package Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton=Singleton.getInstance();
        singleton.getHashcode();
        Singleton singleton2=Singleton.getInstance();
        singleton2.getHashcode();

    }
}
