package ga.ayang.create.simplefactory;

public class SimpleFactory {
    public static Food makeFood(String type) {
        if ("Chinese".equals(type)) {
            return new ChineseFood();
        } else if ("USA".equals(type)) {
            return new USAFood();
        } else {
            return null;
        }
    }
}
