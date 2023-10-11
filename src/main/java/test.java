import java.lang.reflect.Array;
import java.util.Arrays;

class test {
    public static void main(String[] args) {
        String s = "ae@face.md; ser@mail.ru; ww@gmail.com;";
test t =new test();
test.email(s);
    }

    public static void email(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < s.length()-1) {
            //ae@face.md; ser@mail.ru; ww@gmail.com;
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a+1,b));
        }
    }
}