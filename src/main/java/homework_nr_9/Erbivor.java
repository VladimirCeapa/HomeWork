package homework_nr_9;

public abstract class Erbivor {
String height ;
String length;

    public Erbivor(String height, String length) {
        this.height = height;
        this.length = length;
    }
    abstract void eating(String s);
    public void sleeping(){
        System.out.println("Animal is sleeping");
    };
}
