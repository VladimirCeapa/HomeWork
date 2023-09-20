import java.lang.reflect.Array;
import java.util.Arrays;

class test{
    public static void main(String[] args) {
         int  [] s ={1,2,3,4,5,6,7,8,9};
         for(int si:s){
             System.out.println(si);
         }
        System.out.println(Arrays.toString(s));
    }
}