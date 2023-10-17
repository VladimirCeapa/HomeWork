package homework_nr_10;

import java.util.List;
import java.util.function.Predicate;

public class Employee {
  public   String name;
  public   String Surname;
  public   int Age;
  public   String Department;

    public Employee(String name, String surname, int age, String department) {
        this.name = name;
        this.Surname = surname;
        this.Age = age;
        this. Department = department;
    }

    public static void testEmployee(List<Employee> inputEmployee, Predicate<Employee> testMethod) {
        for (Employee element :
                inputEmployee) {
           if( testMethod.test(element)){
               System.out.println(element.Surname);
           }
        }
    }
};