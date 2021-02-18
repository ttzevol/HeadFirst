package headfirst.decorator;

/**
 * @description: some desc
 * @author: wubowen
 * @date: 2021/2/18 0018 17:16
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    //getDescription在此实现
    public String getDescription(){
        return description;
    }

    //cost必须在子类中实现
    public abstract double cost();
}
