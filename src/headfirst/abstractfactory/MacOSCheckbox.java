package headfirst.abstractfactory;

/**
 * @description: 一个勾选框的具体实现
 * @author: wubowen
 * @date: 2021/2/20 0020 10:58
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheck.");
    }
}
