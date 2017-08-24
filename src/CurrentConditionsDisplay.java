import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable)
    {
//        this.observable=observable;
        observable.addObserver(this); //特别注意等一下在上面加一个this试试看
    }

    public void update(Observable obs, Object arg)
    {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData)obs;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            this.pressure=weatherData.getPressure();
            display();
        }
    }
    public void display()
    {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }
}
