import java.lang.reflect.Array;
import java.util.Arrays;

public class code9 {
    public static void main(String[] args){
        String str="i love java";
        String a[]=str.split(" ");
        StringBuilder result= new StringBuilder();
        for(String i : a){
            StringBuilder data=new StringBuilder(i);
            result.append(data.reverse()).append(" ");
        }
        System.out.println(result);





    }
}
