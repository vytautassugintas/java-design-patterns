package ObserverPattern;

/**
 * Created by vytautassugintas on 18/03/16.
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
