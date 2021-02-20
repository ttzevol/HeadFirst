package headfirst.abstractfactory;

/**
 * @description: 抽象工厂
 * @author: wubowen
 * @date: 2021/2/20 0020 11:02
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
