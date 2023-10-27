package homework_nr_14;

import java.io.Serializable;

public class Airplane extends Vehicle implements AirVehicle {

    int numberOfseats;
    String color;

    @Override
    public String toString() {
        return "Airplane{" +
                "numberOfseats=" + numberOfseats +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", nrOfEngines=" + nrOfEngines +
                '}';
    }

    public Airplane(String manufacturer, String model, int nrOfEngines, int numberOfseats, String color) {
        super(manufacturer, model, nrOfEngines);
        this.numberOfseats = numberOfseats;
        this.color = color;
    }
}
