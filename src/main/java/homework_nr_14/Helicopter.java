package homework_nr_14;

import java.io.Serializable;

public class Helicopter extends Vehicle implements AirVehicle {
    int numberOfseats;
    String color;

    public Helicopter(String manufacturer, String model, int nrOfEngines, int numberOfseats, String color) {
        super(manufacturer, model, nrOfEngines);
        this.numberOfseats = numberOfseats;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "numberOfseats=" + numberOfseats +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", nrOfEngines=" + nrOfEngines +
                '}';
    }
}
