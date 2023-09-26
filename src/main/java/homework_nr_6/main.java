package homework_nr_6;

public class main {
    public static void main(String[] args) {

        Invoice payment1 = new Invoice(
                "Samsung",
                "New Model",
                5,
                100);

        System.out.println("-------------------------------");
        System.out.println(payment1.getAmount());
        System.out.println("-------------------------------");

        Date date1 = new Date();
        date1.setDay(23);
        date1.setMonth(7);
        date1.setYear(23);

        date1.displayDate();
        System.out.println("-------------------------------");
    }
}
