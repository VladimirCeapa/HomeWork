package homework_nr_6;

public class Employee {
    private String name;
    private int age;
    private String Department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        Department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return Department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
