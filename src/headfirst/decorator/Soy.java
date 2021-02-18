package headfirst.decorator;

/**
 * @description: 一个具体的装饰者，做法和Mocha一样
 * @author: wubowen
 * @date: 2021/2/18 0018 17:32
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
