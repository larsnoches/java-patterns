package com.company;

public class Main {

    public static void main(String[] args) {
	    WeatherData weatherData = new WeatherData();

	    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

	    weatherData.setMeasurements(80, 60, 30.4f);
	    weatherData.setMeasurements(50, 70, 23.4f);
	    weatherData.setMeasurements(70, 90, 23.4f);
    }
}
