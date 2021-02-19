package headfirst.factorymethod;

/**
 * @description: 基础创建者
 * @author: wubowen
 * @date: 2021/2/19 0019 16:23
 */
public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
