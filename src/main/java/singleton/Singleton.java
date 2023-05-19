package singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Created an instance");
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
