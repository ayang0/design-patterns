package ga.ayang.singleton;

public class DemoSingletonThread {
    public static void main(String[] args) {
        Singleton foo = Singleton.getInstance("FOO");
        Singleton bar = Singleton.getInstance("BAR");
        System.out.println(foo.value);
        System.out.println(bar.value);
    }
}
