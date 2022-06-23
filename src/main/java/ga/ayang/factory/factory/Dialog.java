package ga.ayang.factory.factory;

import ga.ayang.factory.buttons.Button;

/**
 * 工厂 父类 如果创建的子类过多，可以通过传参的方式来返回对象
 */
public abstract class Dialog {
    // 使用Button 模板
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();

}
