package ga.ayang.create.prototype;

/**
 * 1.Java默认是浅拷贝
 * 2.在Clone逐步复制，特别是引用对象
 * 3.best practice: 使用序列化和反序列化解析对象实现深拷贝
 */
public class PrototypeDemo implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
