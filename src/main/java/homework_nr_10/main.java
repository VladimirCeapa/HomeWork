package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static homework_nr_10.Employee.testEmployee;
import static homework_nr_8.main.line;


public class main {
    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            intlist.add(i);
        }
        line();

//Create an implementation of the Predicate functional interface that will check if a number is odd
        Predicate<Integer> testForEvenValue = (Integer i) -> i % 2 == 0;
        Predicate<Integer> testForOddValue = (Integer i) -> i % 3 == 0;
        testIntList(intlist, testForEvenValue);
        line();
        testIntList(intlist, testForOddValue);
        line();

//Create an implementation of the Consumer functional interface that will display the string that is passed to it
        String strHelloWorld = "Hello World";
        List<String> helloWorld = new ArrayList<>();
        helloWorld.add("Hello");
        helloWorld.add("World");
        helloWorld.add("!");
        Consumer<String> printConsumerString = (String s) -> System.out.println(s);
        returnConsumerString(helloWorld, printConsumerString);
        line();

//Create an implementation of the functional interface Function that will accept a number and return the same number multiplied by 2
        Function<Integer, Integer> multiplyByTwo = (Integer i) -> i * 2;
        multiply(5, multiplyByTwo);
        multiply(3, multiplyByTwo);
        line();

//Create an implementation of the Supplier functional interface that will return a random number (bonus)
        Supplier<List<Integer>> randomNumber = () -> {
            List<Integer> randomOfNumbers = new ArrayList<>();
            for (int i = 1; i < 10; i++) {
                randomOfNumbers.add((int) (Math.random() * 100));
            }
            return randomOfNumbers;
        };
        List<Integer> listOfRandomInteger = supplyRandomNewListOfIntegers(randomNumber);
        System.out.println(listOfRandomInteger);
        line();

//Test the Employee objects using the previously created testEmployee method using all the Predicate implementations you created
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Serghei", "Ivanov", 21, "Soft Power"));
        employees.add(new Employee("Petr", "Lanovoi", 32, "Software Engineering"));
        employees.add(new Employee("Ivan", "Petrov", 44, "Soft Power"));
        employees.add(new Employee("Andrei", "Diatlov", 28, "Software Engineering"));
        Predicate<Employee> workInSoftwareEngineering = (Employee element) -> element.Department.equals("Software Engineering");
        Predicate<Employee> overTwentyYearsOld = (Employee element) -> element.Age > 20;
        Predicate<Employee> nameStartsWithA = (Employee element) -> element.name.startsWith("A");

        testEmployee(employees, workInSoftwareEngineering);
        line();
        testEmployee(employees, overTwentyYearsOld);
        line();
        testEmployee(employees, nameStartsWithA);


    }
//implementation of the Supplier functional interface
    public static List<Integer> supplyRandomNewListOfIntegers(Supplier<List<Integer>> supply) {

        return supply.get();
    }
//implementation of the Function functional interface
    public static void multiply(Integer integer, Function<Integer, Integer> function) {
        System.out.println(function.apply(integer));
    }
//implementation of the Consumer functional interface
    public static void returnConsumerString(List<String> inputList, Consumer<String> consumer) {
        for (String element :
                inputList) {
            consumer.accept(element);
        }

    }
//implementation of the Predicate functional interface
    public static void testIntList(List<Integer> inputList, Predicate<Integer> testMethod) {
        for (Integer element :
                inputList) {
            if (testMethod.test(element)) {
                System.out.println(element + " ");
            }

        }
    }
}
