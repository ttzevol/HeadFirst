package headfirst.strategy;

/**
 * @description: 其中一个叫的行为实现类
 * 必须实现QuackBehavior这个接口
 * @author: wubowen
 * @date: 2021/2/7 0007 13:26
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
