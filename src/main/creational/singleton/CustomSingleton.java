package main.creational.singleton;

/*
    bill pugh singleton - best way to implement singleton
 */
public class CustomSingleton {

    private String name = "Vu Thanh Tung";
    /*
        private constructor so user cannot create another instance
     */
    private CustomSingleton() {
    }
    /*
        function to return instance
     */
    public static CustomSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    /*
        helper class to create instance
     */
    private static class SingletonHelper {
        private static final CustomSingleton INSTANCE = new CustomSingleton();
    }

    public String getName() {
        return name;
    }
}
