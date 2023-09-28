package homework_nr_9;

public class Elephant implements Animal {

    String color;
    String size;

    Elephant(String color, String size) {
        this.color = color;
        this.size = size;

    }

    @Override
    public void print() {

    }

    @Override
    public void stop() {
        Animal.super.stop();
        System.out.println("elephant stopped");
    }

    @Override
    public String song() {
        return "elephant trumpets";
    }
}
