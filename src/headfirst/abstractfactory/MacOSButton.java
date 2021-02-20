package headfirst.abstractfactory;

/**
 * @description: 这是按钮的具体实现
 * @author: wubowen
 * @date: 2021/2/20 0020 10:55
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
