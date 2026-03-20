import java.util.*;

public class WeatherData implements Subject{
    
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
        temperature = 0;
        humidity = 0;
        pressure = 0;
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0) observers.remove(i);
    }
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObservers();
    }
}