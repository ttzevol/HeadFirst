package headfirst.observerApi;

import headfirst.observer.DisplayElement;
import headfirst.observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 利用Java内置的Api重写观察者
 * 通过继承java.until.Observer接口实现
 * @author: wubowen
 * @date: 2021/2/7 0007 17:31
 */
public class CurrentConditionsDisplayApi implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayApi(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataApi){
            WeatherDataApi weatherDataApi = (WeatherDataApi) o;
            this.temperature = weatherDataApi.getTemperature();
            this.humidity = weatherDataApi.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and"
        + humidity + "% humidity");
    }
}
