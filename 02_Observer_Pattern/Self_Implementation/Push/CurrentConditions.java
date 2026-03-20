public class CurrentConditions implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    public CurrentConditions(Subject s){
        s.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    } 
    public void display(){
        System.out.println("temperature today is: " + this.temperature);
        System.out.println("humidity today is: " + this.humidity);
    }
}
