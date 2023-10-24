package homework_nr_13;

import java.util.Objects;

public class Airplane {

    String manufacturer;
    String model;
    int nrOfEngines;


    public Airplane(String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneException {
        if (manufacturer=="" || manufacturer==null) {
            throw new InvalidManufacturerException("empty or null parameters of manufacturer");
        }else{
            this.manufacturer = manufacturer;
        }
        if (model=="" || model==null) {
            throw new InvalidModelException("empty or null parameters of model");
        }else {
            this.model = model;
        }
        if (nrOfEngines % 3 == 0){
            throw new InvalidNrOfEnginesException("value zero or odd");
        }else{
            this.nrOfEngines = nrOfEngines;
        }
    }
    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", nrOfEngines=" + nrOfEngines +
                '}';
    }


}
