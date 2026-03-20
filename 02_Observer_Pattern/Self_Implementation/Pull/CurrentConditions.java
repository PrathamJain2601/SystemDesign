public class CurrentConditions implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    WeatherDataSubject s;
    public CurrentConditions(WeatherDataSubject s){
        this.s = s;
        s.registerObserver(this);
    }
    public void update(){
        this.temperature = s.getTemperature();
        this.humidity = s.getHumidity();
        display();
    } 
    public void display(){
        System.out.println("temperature today is: " + this.temperature);
        System.out.println("humidity today is: " + this.humidity);
    }
}
