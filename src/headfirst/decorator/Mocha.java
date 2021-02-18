package headfirst.decorator;

/**
 * @description: 一个具体的装饰者，扩展自CondimentDecorator
 * @author: wubowen
 * @date: 2021/2/18 0018 17:26
 */
public class Mocha extends CondimentDecorator {
    /**
     * 要让Mocah引用一个Beverage，
     * 1.用一个实例变量记录饮料，也就是被装饰者
     * 2.想办法让被装饰者被记录到实例变量中，此处将
     * 饮料作为构造参数
     */
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
