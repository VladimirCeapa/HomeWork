package homework_nr_14;

import java.io.Serializable;

public class Car extends Vehicle  {
    int numberOfseats;
    String color;

    public Car(String manufacturer, String model, int nrOfEngines, int numberOfseats, String color) {
        super(manufacturer, model, nrOfEngines);
        this.numberOfseats = numberOfseats;
        this.color = color;
    }
}
