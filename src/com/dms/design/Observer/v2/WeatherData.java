package com.dms.design.Observer.v2;

import java.util.Observable;

/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title WeatherData
 * @Author: dongms
 * @Date: 2024/5/27
 */
public class WeatherData extends Observable {

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData () {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
