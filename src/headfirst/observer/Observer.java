package headfirst.observer;

/**
 * @description: 观察者接口
 * @author: wubowen
 * @date: 2021/2/7 0007 15:37
 */
public interface Observer {
    //当气象观测值改变时，主题会把这些状态值当做方法的参数传递给观察者
    void update(float temp, float humidity, float pressure);
}
