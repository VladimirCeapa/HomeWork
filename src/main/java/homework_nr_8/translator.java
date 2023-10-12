package homework_nr_8;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static homework_nr_8.main.line;

public class translator {

    public static void translation(HashMap<String, String> input, String word) {
        boolean key = false;
        boolean value=false;
        key = input.containsKey(word);
        if (input.get(word) != null && key) {

            System.out.println("traducere din engleză în română  " + word + "-" + input.get(word));
            line();
            return;
        }
        if (!key ) {
            for (String k : input.keySet()) {
                if (word.equals(input.get(k))) {
                  
                    System.out.println("traducere din română în engleză " + word + "-" + k);

                    value=true;
                    line();

                }
            }
        }
        if (input.get(word) == null && !key && !value){
            System.out.println("Din pacate nu putem traduce");
            line();
        }

    }

}

