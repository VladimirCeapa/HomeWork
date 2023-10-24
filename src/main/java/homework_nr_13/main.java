package homework_nr_13;

import java.util.ArrayList;
import java.util.List;

import static homework_nr_8.main.line;

public class main {
    public static void main(String[] args) throws InvalidAirplaneException ,InvalidRangeException{
        List<Airplane> airplane = new ArrayList<>() {
        };
        line();
        createAirplaneLBYL(airplane, "test", "test", 2);
        createAirplaneLBYL(airplane, "", "test", 2);
        createAirplaneLBYL(airplane, "test", null, 2);
        line();
        createAirplaneEAFP(airplane, "test", "test", 2);
        createAirplaneEAFP(airplane, "", "test", 2);
        createAirplaneEAFP(airplane, "test", "test", 3);
        line();
        System.out.printf("list contents %s \n ", airplane);

        line();
        countDivisibleBy7Numbers(1000,100);

    }


    public static void createAirplaneLBYL(List<Airplane> inputAirplane, String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneException {
        if (manufacturer == "" || manufacturer == null) {
            System.out.println("Failed to create a new airplane");
            return;
        }
        if (model == "" || model == null) {
            System.out.println("Failed to create a new airplane");
            return;
        }
        if (nrOfEngines % 3 == 0) {
            System.out.println("Failed to create a new airplane");
        }

        inputAirplane.add(new Airplane(manufacturer, model, nrOfEngines));
        System.out.println("Create a new airplane and handling with exception LBYL");

    }


    public static void createAirplaneEAFP(List<Airplane> inputAirplane, String manufacturer, String model, int nrOfEngines) {
        try {
            inputAirplane.add(new Airplane(manufacturer, model, nrOfEngines));
            System.out.println("Create a new airplane and handling with exception EAFP");
        } catch (InvalidAirplaneException e) {
            System.out.println("Failed to create a new airplane");
        }
    }
    public static void countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {

        if (inferiorLimit>superiorLimit){
            throw new InvalidRangeException("InterfaceLimit ");
        }

    try {
        StringBuilder numbers = new StringBuilder();
        for (int i = inferiorLimit; i != superiorLimit; i++) {
            if (i % 7 == 0) {
                numbers.append(i + " ");
            }
        }
    }catch (Exception e){
        System.out.println("InterfaceLimit ");
    }
}}