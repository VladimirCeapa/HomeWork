package homework_nr_4;

public class Circle {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        circle1.calculateArea();
        TemperatureConverter converter = new TemperatureConverter(55,578);
        System.out.println("Convert Fahrenheit to Celsius:"+converter.toCelsius(converter.fahrenheit));
        System.out.println("Convert Celsius to Fahrenheit:"+converter.toFahrenheit(converter.celsius));
    }
    float radius;
    public  void calculateArea() {

        System.out.println("Radius:="+Math.PI * (radius * radius));
    }



    public Circle(int radius) {
        this.radius = radius;
    }
}
