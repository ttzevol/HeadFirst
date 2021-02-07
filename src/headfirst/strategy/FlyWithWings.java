package headfirst.strategy;

/**
 * @description: 这是其中一个飞行行为的类
 * 必须实现飞行行为接口
 * @author: wubowen
 * @date: 2021/2/7 0007 13:17
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
