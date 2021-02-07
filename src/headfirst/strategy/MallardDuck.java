package headfirst.strategy;

/**
 * @description: 一个Duck的实现类，继承Duck类
 * @author: wubowen
 * @date: 2021/2/7 0007 13:33
 */
public class MallardDuck extends Duck {
    //最终把决定使用哪个具体实现类的权利交给Duck实现类的抽象方法
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    //每个Duck的实现类都必须实现的一个抽象方法
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
