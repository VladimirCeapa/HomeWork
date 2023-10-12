package homework_nr_9;

interface Animal{

    void move();
    static void run(){}
    default void stop(){}
     String sound();
}