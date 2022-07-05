package ga.ayang.create.singleton;

import java.util.Objects;

public class LazySingleton {
    private LazySingleton(){};
    private static volatile LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (LazySingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
