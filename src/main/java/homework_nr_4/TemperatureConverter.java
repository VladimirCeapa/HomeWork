package homework_nr_4;

public class TemperatureConverter {
    public static void main(String[] args) {

TemperatureConverter converter = new TemperatureConverter(22,847);
        System.out.println("Convert Fahrenheit to Celsius:"+converter.toCelsius(converter.fahrenheit));
        System.out.println("Convert Celsius to Fahrenheit:"+converter.toFahrenheit(converter.celsius));
    }
    float celsius;
    float fahrenheit;
    public  double toCelsius(float Fahrenheit){
      return (Fahrenheit-32)/1.8;
    }
    public  double toFahrenheit(float Celsius){
        return Celsius *1.8+32;
    }
    public TemperatureConverter(float celsius,float fahrenheit) {
        this.celsius=celsius;
        this.fahrenheit=fahrenheit;
    }
}
