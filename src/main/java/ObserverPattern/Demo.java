package ObserverPattern;

import ObserverPattern.Display.CurrentConditionDisplay;
import ObserverPattern.Display.ForecastDisplay;
import ObserverPattern.Display.ThirdPartyDisplay;

/**
 * Created by vytautassugintas on 18/03/16.
 */
public class Demo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // observers, they register via constructor
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        // magic is in here
        weatherData.setMeasurements(30, 20, 20);
        weatherData.setMeasurements(14, 40, 23);
        weatherData.setMeasurements(7, 10, 14);



    }
}
