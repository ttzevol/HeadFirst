package headfirst.factorymethod;

/**
 * @description: 具体创建者
 * @author: wubowen
 * @date: 2021/2/19 0019 16:26
 */
public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
