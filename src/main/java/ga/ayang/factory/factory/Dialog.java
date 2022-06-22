package ga.ayang.factory.factory;

import ga.ayang.factory.buttons.Button;

public abstract class Dialog {
    // 使用Button 模板
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();

}
