package headfirst.decorator;

/**
 * @description: 一种饮料
 * @author: wubowen
 * @date: 2021/2/18 0018 17:22
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        //返回饮料的价钱，此处没有关注调料
        return 1.99;
    }
}
