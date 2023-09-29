package homework_nr_9;

import static homework_nr_8.main.line;

public class main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("1.5m", "2m", "grew", "big", "Bombom");
        line();
        elephant.move();
        elephant.stop();
        System.out.println(elephant.sound());
        elephant.info();
        Elephant elephant1 = new Elephant("0.5m", "1m", "white", "small", "Jumbo");
        line();
        elephant1.eating("bananas");
        elephant1.sleeping();
        elephant1.move();
        elephant1.stop();
        System.out.println(elephant1.sound());
        elephant1.info();
        line();


    }

}
