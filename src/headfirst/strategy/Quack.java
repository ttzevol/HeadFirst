package headfirst.strategy;

/**
 * @description: 其中一个叫的行为实现类
 * 必须实现QuackBehavior这个接口
 * @author: wubowen
 * @date: 2021/2/7 0007 13:22
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
