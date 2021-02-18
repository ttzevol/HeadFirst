package headfirst.decorator;

/**
 * @description: 装饰者模式的测试
 * @author: wubowen
 * @date: 2021/2/18 0018 17:37
 */
public class StarbuzzCoffe {

    public static void main(String[] args) {
        //一杯Espresso，不需要调料
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $"
        + beverage.cost());

        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription() + " $"
                + beverage1.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $"
                + beverage2.cost());
    }

}
