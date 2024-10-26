package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToBreakSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        Singleton original=Singleton.getInstance();
        Singleton duplicate=Singleton.getInstance();

        System.out.println("Hashcode for original: "+original.hashCode());
        System.out.println("Hashcode for duplicate: "+duplicate.hashCode());

        //Using Reflection, we can access the constructor to help create a new instance. It is done as follows

        Class<?> singletonInstance=Class.forName("Singleton.Singleton");
        Constructor<Singleton> constructor = (Constructor<Singleton>) singletonInstance.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton brokenSingletonUsingReflection=constructor.newInstance();
        System.out.println("Hashcode for broken Singleton instance: "+brokenSingletonUsingReflection.hashCode());

        //Breaking using Cloning
        System.out.println("----------------------------------Breaking using cloning---------------------------------------");
        Singleton brokenSingletonUsingCloning=(Singleton) original.clone();
        System.out.println("Hashcode for broken Singleton using Clone: "+brokenSingletonUsingCloning.hashCode());

    }
}
