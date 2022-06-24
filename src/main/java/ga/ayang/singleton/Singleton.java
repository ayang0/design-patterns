package ga.ayang.singleton;

public class Singleton {
    private static Singleton instance;
    public String value;
    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.value = value;
    }
    public static Singleton getInstance(String value) {
        if (instance == null) {
            // 如果有多线程则需要加入通过不模块防止创建多个和对象
            instance = new Singleton(value);
        }
        return instance;
    }
}
