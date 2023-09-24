package homework_nr_7;

public class main {
    public static void main(String[] args) {
        Manager m1= new Manager("Serghei","Petrov","Rasvet",12,"Diamond Power");
        Manager m2= new Manager("Leonidas","King","Greece",300,"Spartan");
        Programmer p1= new Programmer("Petr","Ivanov","EBBE","Golang","100");
        Programmer p2= new Programmer("Gheorghe","Borodin","Franzeluta","Java","1000");

        System.out.println("--------------------method call printMyName()------------------------------");

        m1.printMyName();
        m2.printMyName();
        p1.printMyName();
        p2.printMyName();

        System.out.println("--------------------method call work()------------------------------");
        m1.work();
        m2.work();
        p1.work();
        p2.work();

        System.out.println("--------------------for with instanceof method call work()------------------------------");
        Person [] team=new Person[]{m1,m2,p1,p2};
        for (int i=0;i!=team.length;i++){
            if(team[i] instanceof Manager tempObject){
                tempObject.work();
            }
        }
    }
}
