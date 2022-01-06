package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
    }
}

class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return s;
    }
}
