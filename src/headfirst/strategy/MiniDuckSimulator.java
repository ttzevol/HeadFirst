package headfirst.strategy;

/**
 * @description: 策略模式的测试
 * 策略模式定义了算法族，分别封装起来，让它们之间互相替换，
 * 此模式让算法的变化独立于使用算法的客户
 * 总结：多用组合，少用继承
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
