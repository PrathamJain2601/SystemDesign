public class WorkStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditions cr = new CurrentConditions(wd);
        StatisticsDisplay sd = new StatisticsDisplay(wd);

        wd.measurementsChanged(12.2f, 78.0f, 50.0f);
        wd.removeObserver(sd);
        wd.measurementsChanged(22.2f, 48.0f, 70.0f);
    }
}
