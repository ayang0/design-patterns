package ga.ayang.factory.factory;

import ga.ayang.factory.buttons.Button;
import ga.ayang.factory.buttons.HtmlButton;

/**
 * 父类提供创建方法 子类选择产品
 */
public class HtmlDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
