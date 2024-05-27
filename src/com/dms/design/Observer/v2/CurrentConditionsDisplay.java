package com.dms.design.Observer.v2;

import java.util.Observable;
import java.util.Observer;

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
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public Observable getObservable () {
        return observable;
    }

    public void setObservable (Observable observable) {
        this.observable = observable;
    }

    public void update (Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display () {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public CurrentConditionsDisplay (Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
}
