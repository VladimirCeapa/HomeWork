package homework_nr_4;

public class Circle {
    public static void main(String[] args) {
       int radius=3;
        calculateArea(radius);
    }
    public static void calculateArea(int radius){

        System.out.println(Math.PI*(radius*radius));
    }
}
