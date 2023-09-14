package homework_nr_5;

import java.util.Arrays;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int sumOfEvenElements = 0;
        long productOfAddElements = 1L;
        int[] numbers = new int[100];
        int[] copyNumbers = new int[numbers.length];

        //Filling the array numbers
        for (int i = 0; i != numbers.length; i++) {
            if (i % 2 == 0) {
                sumOfEvenElements += i;
            } else {
                productOfAddElements *= i;
            }
            numbers[i] = i;
        }
        //Copy elements of array numbers to array copyNumbers
        // System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);
        for (int i = 0; i != numbers.length; i++){
            copyNumbers[i]=numbers[i];
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Elements of array numbers");
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Elements of array copyNumbers");
        System.out.println(Arrays.toString(copyNumbers));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Sum of Even Elements in arr numbers    := " + sumOfEvenElements);
        System.out.println("Product of Add Elements in arr numbers := " + productOfAddElements);
        System.out.println("------------------------------------------------------------------");
    }
}
