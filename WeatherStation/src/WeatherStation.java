import classes.CurrentConditionsDisplay;
import classes.ForecastDisplay;
import classes.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10, 20,30);
        System.out.println("Шторм");
        weatherData.setMeasurements(30, 20, 10);
    }
}
