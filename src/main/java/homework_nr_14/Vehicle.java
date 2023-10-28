package homework_nr_14;

import java.io.Serializable;

public class Vehicle implements Serializable {
    String manufacturer;
    String model;
    int nrOfEngines;

    public Vehicle(String manufacturer, String model, int nrOfEngines) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfEngines = nrOfEngines;
    }

}
