package homework_nr_15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import static homework_nr_8.main.line;

public class Car implements Comparable<Car> {
    int yearMade;
    String name;

    public Car(int yearMade, String name) {
        this.yearMade = yearMade;
        this.name = name;
    }

    public static void main(String[] args) {

        Car a1 = new Car(1990, "Indigo");
        Car a2 = new Car(2000, "Bingo");
        Car a3 = new Car(2010, "Dingo");
        Car a4 = new Car(1980, "Andigo");
        HashSet<Car> carsList = new HashSet<>(
                Arrays.asList(a1, a3, a4, a2)
        );
        //sorted by yearMade
        carsList.stream()
                .sorted()
                .forEach(e -> System.out.println(e));

        line();
        TreeSet<Car> carsTree = new TreeSet<>(
                Arrays.asList(a1, a3, a4, a2)
        );
        //sorted by Name
        Comparator<Car> comparingByName = Comparator.comparing((Car c) -> c.name);
        carsTree.stream()
                .sorted(comparingByName)
                .forEach(e -> System.out.println(e));
    }


    @Override
    public String toString() {
        return "Car{" +
                "yearMade=" + yearMade +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Car o) {
        return this.yearMade - o.yearMade;
    }
}

