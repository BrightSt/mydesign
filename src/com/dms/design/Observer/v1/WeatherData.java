package com.dms.design.Observer.v1;

import java.util.ArrayList;

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
public class WeatherData implements Subject{

    private ArrayList<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData () {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver (Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver (Observer o) {
        int i = observers.indexOf(o);
        if ( i > 0 ){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers () {
        for ( int i = 0 ; i < observers.size() ; i++ ) {
             Observer observer  = observers.get(i);
             observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
