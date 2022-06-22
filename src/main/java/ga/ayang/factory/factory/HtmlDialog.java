package ga.ayang.factory.factory;

import ga.ayang.factory.buttons.Button;
import ga.ayang.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
