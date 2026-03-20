public interface WeatherDataSubject extends Subject {
    float getTemperature();
    float getHumidity();
    float getPressure();
}