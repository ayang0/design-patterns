package ga.ayang.create.singleton;

public class Singleton {
    private Singleton() {
    }

    private static class Holder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.instance;
    }
}
