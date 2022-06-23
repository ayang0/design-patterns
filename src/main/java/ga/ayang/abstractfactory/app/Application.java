package ga.ayang.abstractfactory.app;

import ga.ayang.abstractfactory.buttons.Button;
import ga.ayang.abstractfactory.checkboxes.Checkbox;
import ga.ayang.abstractfactory.factories.GUIFactory;

/**
 * 客户端代码
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
