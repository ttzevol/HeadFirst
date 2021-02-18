package headfirst.decorator;

/**
 * @description: 装饰者类 让此类能够取代Beverage，将CondimentDecorator
 * 扩展自Beverage
 * @author: wubowen
 * @date: 2021/2/18 0018 17:19
 */
public abstract class CondimentDecorator extends Beverage {
    //所有的调料装饰者都必须重新实现getDescription
    public abstract String getDescription();
}
