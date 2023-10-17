package homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static homework_nr_8.main.line;


public class main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Serghei", "Ivanov", 35, true));
        personList.add(new Person("Alex", "Petrov", 22, true));
        personList.add(new Person("Gheoghe", "Sidorov", 37, false));
        personList.add(new Person("Ion", "Nazarov", 33, true));
        personList.add(new Person("Serghei", "Sedoi", 50, false));
        personList.add(new Person("Petr", "Rudei", 25, false));
        personList.add(new Person("Andrei", "Silivanov", 44, true));
        personList.add(new Person("Ion", "Irvanov", 37, true));
        personList.add(new Person("Dmitrii", "AvanovA", 35, false));
        personList.add(new Person("Vasili", "Petrov", 28, true));

        line();
        System.out.println(" Employees over 25 years of age and are paid hourly.");

        List<Person> Employees = personList.stream()
                .filter(p -> p.age > 25)
                .filter(p -> p.isPayedByHour)
                .limit(5)
                .toList();
        System.out.println();
        infoPerson(Employees);

        line();
        System.out.println(" Employees over 30 years of age and surname starts with A.");
        List<Person> EmployeesOverThirty=personList.stream()
                .filter(p -> p.age>30)
                .filter(p -> p.surname.startsWith("A"))
                .toList();
        infoPerson(EmployeesOverThirty);

        line();
        System.out.println(" Employees over 37 years of age and surname starts with A.");
        Optional<Person> Employees2=personList.stream()
                .filter(p->p.age==37)
                .findFirst();

        Employees2.ifPresent(person -> System.out.printf(" %s %s",person.name,person.surname));





    }
    public static void infoPerson(List<Person> inputPerson){
        for (Person p:
                inputPerson) {
            System.out.printf(" %s  %s  \n",p.name,p.surname);
        }

    }


}
