package headfirst.abstractfactory;

/**
 * @description: 客户端代码，用户不再关心使用的事哪一个具体的产品工厂
 * @author: wubowen
 * @date: 2021/2/20 0020 11:10
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
