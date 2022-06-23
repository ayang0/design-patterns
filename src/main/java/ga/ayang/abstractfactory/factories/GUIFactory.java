package ga.ayang.abstractfactory.factories;

import ga.ayang.abstractfactory.buttons.Button;
import ga.ayang.abstractfactory.checkboxes.Checkbox;

/**
 * 抽象工厂
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
