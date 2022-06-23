package ga.ayang.abstractfactory.factories;

import ga.ayang.abstractfactory.buttons.Button;
import ga.ayang.abstractfactory.buttons.MacOSButton;
import ga.ayang.abstractfactory.checkboxes.Checkbox;
import ga.ayang.abstractfactory.checkboxes.MacOSCheckbox;
import ga.ayang.abstractfactory.checkboxes.WindowsCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
