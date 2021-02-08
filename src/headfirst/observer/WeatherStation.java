package headfirst.observer;



/**
 * @description: 观察者模式的测试类
 * @author: wubowen
 * @date: 2021/2/7 0007 16:03
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(20.0f, 21.0f, 22.0f);
        weatherData.setMeasurements(30.0f, 31.0f, 32.0f);
        weatherData.setMeasurements(40.0f, 41.0f, 42.0f);
    }
}
