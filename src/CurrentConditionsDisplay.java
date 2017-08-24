public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject WeatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.WeatherData=weatherData;
        WeatherData.registerObserver(this);
    }

    public void update(float temperature,float humidity,float pressure)
    {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
    public void display()
    {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }
}
