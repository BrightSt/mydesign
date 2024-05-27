package com.dms.design.Observer.v2;


/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title WeatherStation
 * @Author: dongms
 * @Date: 2024/5/27
 */
public class WeatherStation {

    public static void main (String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);

        currentConditionsDisplay.getObservable().deleteObserver(currentConditionsDisplay);

        weatherData.setMeasurements(45,65,30.4f);
        weatherData.setMeasurements(45,70,29.2f);


    }
}
