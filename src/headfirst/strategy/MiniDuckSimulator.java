package headfirst.strategy;

/**
 * @description: 策略模式的测试
 * @author: wubowen
 * @date: 2021/2/7 0007 13:37
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
