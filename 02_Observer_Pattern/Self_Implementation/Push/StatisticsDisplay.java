public class StatisticsDisplay implements DisplayElement, Observer{
    private float pressure;
    public StatisticsDisplay(Subject s){
        s.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure){
        this.pressure = pressure;
        display();
    } 
    public void display(){
        System.out.println("pressure today is: " + this.pressure);
    }
}
