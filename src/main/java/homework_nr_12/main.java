package homework_nr_12;

import java.util.Arrays;

import static homework_nr_8.main.line;

public class main {


    public static void main(String[] args) {
        Months[] months = Months.values();
        line();
        System.out.println(Arrays.toString(months));
        line();
        FuelTypes[] fuelTypes = FuelTypes.values();
        System.out.println(fuelTypes[0].isLiquidFuel());
        System.out.println(fuelTypes[2].isLiquidFuel());
        line();
        Integer number = 2;
        Integer number1 =-3;
        checkInteger(number, CheckInteger.CHECK_IF_EVEN);
        checkInteger(number, CheckInteger.CHECK_IF_POSITIVE);
        checkInteger(number, CheckInteger.CHECK_IF_ODD);
        checkInteger(number, CheckInteger.CHECK_IF_NEGATIVE);
        line();
        checkInteger(number1, CheckInteger.CHECK_IF_EVEN);
        checkInteger(number1, CheckInteger.CHECK_IF_POSITIVE);
        checkInteger(number1, CheckInteger.CHECK_IF_ODD);
        checkInteger(number1, CheckInteger.CHECK_IF_NEGATIVE);
    }

    public static void checkInteger(Integer number, CheckInteger checkInteger) {
        System.out.println(checkInteger.getIntegerPredicate().test(number));
    }
}
