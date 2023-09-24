package homework_nr_7;

abstract class Employee extends Person {
     String companyName;

    public Employee(String name, String surname, String companyName) {
        super(name, surname);
    }


    abstract void  work();

}
