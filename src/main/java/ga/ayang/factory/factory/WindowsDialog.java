package ga.ayang.factory.factory;

import ga.ayang.factory.buttons.Button;
import ga.ayang.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
