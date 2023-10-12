package homework_nr_8;

import java.util.*;

import static homework_nr_8.translator.translation;

public class main {

    public static void main(String[] args) {

        //working with To Do List
        List<String> DoList = new ArrayList<>(Arrays.asList("climb", "shower", "charger", "meal", "way to work", "Job", "meal", "Job", "way home from work", "shower", "meal"));

        toDoList(DoList);
        uniqueList(DoList);

        //working with a dictionary
        HashMap<String, String> newWords = new HashMap<>();


        newWords.put("iron", "fier");
        newWords.put("jump rope", "a sări coarda");
        newWords.put("squirrel", "veveriţă");
        newWords.put("dictionary", "dicţionar");
        newWords.put("book", "carte");
        newWords.put("TV", "televizor");
        newWords.put(" gingerbread", "turtă dulce");
        newWords.put("cone", " con");
        newWords.put("candle", "lumânare");
        newWords.put("flowers", "floare");

        translation(newWords, "book");
        translation(newWords, "flowers");
        translation(newWords, "carte");

        translation(newWords,"error"); //absence check

        translation(newWords,"turtă dulce");

        translation(newWords,"gresala"); //absence check
    }

    static void toDoList(List<String> input) {
        System.out.println("      ********* TO DO LIST *********   ");
        System.out.println(input);
        line();
    }

    static void uniqueList(List<String> input) {
        HashMap<String, Integer> ToDoList = new HashMap<>();
        for (int i = 0; i != input.size(); i++) {
            ToDoList.put(input.get(i), i);
        }
        System.out.println("      ********* UNIQUE LIST *********   ");
        System.out.println(ToDoList.keySet());
        line();

    }

    public static void line() {
        System.out.println("-------------------------------------------------------------------------- ");
    }

}

