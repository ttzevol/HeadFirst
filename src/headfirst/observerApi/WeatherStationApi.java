package headfirst.observerApi;

/**
 * @description: 观察者模式的测试类，
 * @author: wubowen
 * @date: 2021/2/7 0007 17:46
 */
public class WeatherStationApi {
    public static void main(String[] args) {
        WeatherDataApi weatherDataApi = new WeatherDataApi();
        CurrentConditionsDisplayApi currentConditionsDisplayApi = new CurrentConditionsDisplayApi(weatherDataApi);
        weatherDataApi.setMeasurements(20.1f, 20.2f, 20.3f);
        weatherDataApi.setMeasurements(30.1f, 30.2f, 30.3f);
        weatherDataApi.setMeasurements(40.1f, 40.2f, 40.3f);
    }
}
