package homework_nr_16;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src/main/java/homework_nr_16/input.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        ) {
            String line;
            List<String> t = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                t.add(line);
            }
            getArrays(t);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void getArrays(List<String> input) {
        String[] list = new String[4];
        for (int i =0;i!=input.size();i++){
            System.out.println(list=input.get(i).split(","));
        }
        System.out.println(Arrays.toString(list));

    }

    public static void getInfo(String... input) {

        String name = input[0];


    }

    @Override
    public String toString() {
        return super.toString();
    }
}