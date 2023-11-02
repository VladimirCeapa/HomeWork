package homework_nr_16;

import javax.sound.sampled.spi.AudioFileWriter;
import java.io.*;
import java.util.*;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src/main/java/homework_nr_16/input.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/homework_nr_16/output.txt"));
        ) {
            String line;
            String strstring = "";
            String[] strSplit;
            while ((line = reader.readLine()) != null) {
                strstring += line + " ";
            }
            strSplit = strstring.split(" ");

            writer.write(dataProcessing(strSplit));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static String dataProcessing(String... inputString) {

        String[][] persona = new String[inputString.length][];
        for (int i = 0; i != inputString.length; i++) {
            persona[i] = inputString[i].split(",");
        }
        int max = Integer.parseInt(persona[0][1]);
        int min = Integer.parseInt(persona[0][1]);
        String nameMaxAge = "";
        String nameMinAge = "";
        double gpa = 0.0;
        for (int i = 0; i != inputString.length; i++) {
            if (Integer.parseInt(persona[i][1]) > max) {
                max = (Integer.parseInt(persona[i][1]));
                nameMaxAge = persona[i][0];
            }
            if (Integer.parseInt(persona[i][1]) < min) {
                min = (Integer.parseInt(persona[i][1]));
                nameMinAge = persona[i][0];
            }
            gpa += Double.parseDouble(persona[i][2]);
        }
        String total = "";
        total += "Средний балл:" + gpa / persona.length + "\n" + "Самый молодой человек:" + nameMinAge + " (Возраст:" + min + ")\n" + "Самый старший человек:" + nameMaxAge + " (Возраст:" + max + ")";
        return total;

    }
}