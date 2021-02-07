package headfirst.strategy;

/**
 * @description: Duck抽象类
 * @author: wubowen
 * @date: 2021/2/7 0007 13:13
 */
public abstract class Duck {
    //为行为接口类型生命两个引用变量，所有子类都会继承这两个属性
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    //一个每个子类都不同的属性，所以使用抽象方法
    public abstract void display();

    //委托给行为类
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    //一个每个子类都相同的行为
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
