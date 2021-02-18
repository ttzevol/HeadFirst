package headfirst.decorator;

/**
 * @description: 这是另一种饮料，做法和Espresso一样
 * @author: wubowen
 * @date: 2021/2/18 0018 17:24
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
