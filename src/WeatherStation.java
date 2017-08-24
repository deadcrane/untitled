public class WeatherStation {
    public static void main(String[] args)
    {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentDisplay= new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(881,64,30.4f);
        weatherData.setMeasurements(80,54,33.4f);
        weatherData.setMeasurements(82,61,31.4f);
        weatherData.setMeasurements(84,60,40.4f);
        weatherData.setMeasurements(70,94,90.4f);
    }
}
