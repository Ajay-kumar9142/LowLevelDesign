package org.example.lowLevelDesign.behavioralDesignPattern.observerDesignPattern.weatherMonitor;

public class WeatherStationClient {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.attach(new CurrentWeatherCond());
        weatherData.attach(new StatiticsWeatherCond());

        weatherData.setMeasurements(45, 23, 56);
        weatherData.setMeasurements(12, 56, 32);
        weatherData.setMeasurements(43, 54, 34);
    }
}
