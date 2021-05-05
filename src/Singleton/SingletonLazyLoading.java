package Singleton;

public class SingletonLazyLoading {
    private static class Singleton {
        private static SingletonLazyLoading instance = new SingletonLazyLoading();

        private Singleton() {

        }

        public static final SingletonLazyLoading getInstance() {
            return Singleton.instance;
        }
    }
}
