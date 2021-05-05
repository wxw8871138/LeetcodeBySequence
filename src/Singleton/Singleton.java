package Singleton;
// eager loading
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
