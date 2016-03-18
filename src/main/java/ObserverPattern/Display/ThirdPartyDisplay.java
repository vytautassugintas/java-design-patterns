package ObserverPattern.Display;

import ObserverPattern.DisplayElement;
import ObserverPattern.Observer;
import ObserverPattern.Subject;

/**
 * Created by vytautassugintas on 18/03/16.
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ThirdPartyDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Third Party: Temperatura: " + temperature + " Slegis: " + pressure + "% Dregme: " + humidity + "%");
    }
}
