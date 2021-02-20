package headfirst.abstractfactory;

/**
 * @description: Mac的具体工厂
 * @author: wubowen
 * @date: 2021/2/20 0020 11:04
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
