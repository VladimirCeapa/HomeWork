import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class test{
    public static void main(String[] args) {
        List<String> s1=new ArrayList<>(){};
        List<String> s2=new ArrayList<>(){};
        s1.add("BBBB");
        s1.add("aaa");
        printLis(s1,s2);
        System.out.println(s2);
    }
    public static void printLis(List<? extends String>el,List<String> w){
        for (Object e:
             el) {
            System.out.println(e);
            w.add(el.get(0));
        }
    }
}