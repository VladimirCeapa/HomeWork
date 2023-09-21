package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;


    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("data day entry error");
        } else {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("data month entry error");
        } else {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year < 1 || year >2024) {
            System.out.println("data year entry error");
        } else {
            this.year = year;
        }
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
