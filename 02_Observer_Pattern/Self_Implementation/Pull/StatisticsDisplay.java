public class StatisticsDisplay implements DisplayElement, Observer{
    private float pressure;
    private WeatherDataSubject s;
    public StatisticsDisplay(WeatherDataSubject s){
        this.s = s;
        this.s.registerObserver(this);
    }
    public void update(){
            this.pressure = this.s.getPressure();
            display();
    } 
    public void display(){
        System.out.println("pressure today is: " + this.pressure);
    }
}
