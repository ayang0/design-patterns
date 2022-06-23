package ga.ayang.abstractfactory.factories;

import ga.ayang.abstractfactory.buttons.Button;
import ga.ayang.abstractfactory.buttons.WindowsButton;
import ga.ayang.abstractfactory.checkboxes.Checkbox;
import ga.ayang.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
