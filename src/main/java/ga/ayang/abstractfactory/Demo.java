package ga.ayang.abstractfactory;

import ga.ayang.abstractfactory.app.Application;
import ga.ayang.abstractfactory.factories.GUIFactory;
import ga.ayang.abstractfactory.factories.MacOSFactory;
import ga.ayang.abstractfactory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
