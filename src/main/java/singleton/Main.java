package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        if (s1 == s2) {
            System.out.println("s1 and s2 are the same instances");
        } else {
            System.out.println("s1 and s2 are not the same");
        }
        System.out.println("End");
    }
}
