package headfirst.abstractfactory;

/**
 * @description: windows的具体工厂
 * @author: wubowen
 * @date: 2021/2/20 0020 11:06
 */
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
