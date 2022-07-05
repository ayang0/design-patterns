package ga.ayang.create.singleton;

import java.util.Date;

/**
 * 饿汉单例模式，初始化类是生产单例对象，天然具有单例性
 * 但是由于类加载完成时就会生成对象且存在整个生命周期，占用内存问题需要考虑
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {
    }
    public static HungrySingleton getInstance() {
        return instance;
    }
    // 一旦调用 类则初始化完成
    public static Date getDate() {
        return new Date();
    }
}
