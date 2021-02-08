package headfirst.observerApi;

import java.util.Observable;

/**
 * @description: 利用Java内置的支持重做观察者示例
 * 通过继承Observable来实现主题类
 * 不再需要追踪观察者以及管理注册添加
 * @author: wubowen
 * @date: 2021/2/7 0007 16:54
 */
public class WeatherDataApi extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged(){
        setChanged();
        //没有调用notifyObservers传送数据对象，这表示我们采用的做法是拉
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //因为要使用拉的方法，所以需要以下getter方法
    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }
}
