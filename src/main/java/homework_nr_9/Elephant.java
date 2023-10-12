package homework_nr_9;

public class Elephant extends Erbivor implements Animal {

    String color;
    String size;
    String name;

    public Elephant(String height, String length, String color, String size, String name) {
        super(height, length);
        this.color = color;
        this.size = size;
        this.name = name;
    }

    public void info(){
        System.out.println("Elephant is "+color+" and "+size);

    }

    @Override
    public void move() {
        System.out.println("Elephant is moving");
    }
    @Override
    public void stop() {
        Animal.super.stop();
        System.out.println("elephant stopped");
    }

    @Override
    public String sound() {
        return "elephant trumpets";
    }

    @Override
    void eating(String s) {
        System.out.println("Elephant is eating "+s);
    }


}
