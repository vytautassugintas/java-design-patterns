package ObserverPattern.Display;

import ObserverPattern.DisplayElement;
import ObserverPattern.Observer;
import ObserverPattern.Subject;

/**
 * Created by vytautassugintas on 18/03/16.
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        if (temperature > 20) {
            System.out.println("Forecast: Hot day");
        }else if (temperature < 10 ){
            System.out.println("Forecast: It's cold today");
        }else {
            System.out.println("Forecast: Don't forget your sweater");
        }
    }
}
