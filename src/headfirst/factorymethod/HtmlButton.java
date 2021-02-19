package headfirst.factorymethod;

/**
 * @description: 具体产品
 * @author: wubowen
 * @date: 2021/2/19 0019 15:37
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
