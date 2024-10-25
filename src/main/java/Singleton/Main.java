package Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton=Singleton.getInstance("Ashmeet");
        singleton.getHashcode();
        Singleton singleton2=Singleton.getInstance("Sameer");
        singleton2.getHashcode();

    }
}
