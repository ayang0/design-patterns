package ga.ayang.create.simplefactory;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        Food usa = SimpleFactory.makeFood("USA");
        if (Objects.nonNull(usa)) {
            usa.describe();
        }
    }
}
