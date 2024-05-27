package com.dms.design.Observer.v1;

/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title CurrentConditionsDisplay
 * @Author: dongms
 * @Date: 2024/5/27
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public Subject getWeatherData () {
        return weatherData;
    }

    public CurrentConditionsDisplay (Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display () {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update (float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
