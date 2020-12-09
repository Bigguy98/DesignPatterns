package main.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakSingleton {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        EagerInitialization instance1  = EagerInitialization.getInstance();
        EagerInitialization instance2 = null;

        Constructor<?>[] constructors = EagerInitialization.class.getDeclaredConstructors();
        for(Constructor<?> constructor: constructors ) {
            constructor.setAccessible(true);
            /*
                set private constructor to public, and creat new instance with constructor.newInstance()
             */
            instance2 = (EagerInitialization) constructor.newInstance();
        }
        /*
            compare hash code of 2 instances --> singleton had been broken
         */
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
