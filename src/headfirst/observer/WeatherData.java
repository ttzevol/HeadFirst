package headfirst.observer;

import java.util.ArrayList;

/**
 * @description: 主题接口的实现类
 * @author: wubowen
 * @date: 2021/2/7 0007 15:44
 */
public class WeatherData implements Subject {
    //创建一个ArrayList来记录观察者
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        //在构造方法中实现ArrayList
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        //在这里，我们把状态告诉每一个观察者
        for (int i=0; i<observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    //当气象站得到更新观测值时，我们通知观察者
    public void measurementsChanged(){
        notifyObservers();
    }

    //当气象站得到最新的数据时调用这个方法
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
