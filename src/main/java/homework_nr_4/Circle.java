package homework_nr_4;

public class Circle {

    public static void main(String[] args) {
        int radius = 4;
        calculateArea(radius);
        Circle circle1 = new Circle(10);
        calculateArea(circle1.radius);
        TemperatureConverter converter = new TemperatureConverter(55,578);
        System.out.println("Convert Fahrenheit to Celsius:"+converter.toCelsius(converter.fahrenheit));
        System.out.println("Convert Celsius to Fahrenheit:"+converter.toFahrenheit(converter.celsius));
    }

    public static void calculateArea(int radius) {

        System.out.println("Radius:="+Math.PI * (radius * radius));
    }

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
}
