package homework_nr_7;

public class Programmer extends Employee {
    String programmingLanguage;
    String yearsOfExperience;

    public Programmer(String name, String surname, String companyName, String programmingLanguage, String yearsOfExperience) {
        super(name, surname, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    void work() {
        System.out.println("Programmer "+name+" is work");
    }

    @Override
    public void printMyName() {
        System.out.println("I'm a programmer and my name is "+name);
    }
}
