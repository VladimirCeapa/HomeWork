package homework_nr_9;
interface Animal{

    void print();
    static void run(){}
    default void stop(){
        System.out.println();
    }
   public String song();
}
public class main {
    public static void main(String[] args) {
Elephant elephant=new Elephant("grew","big");
elephant.stop();


    }

}
