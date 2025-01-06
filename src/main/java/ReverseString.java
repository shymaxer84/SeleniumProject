import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
//Way1
//    public static void main(String[] args) {
//
//        String str = "the sky is blue";
//
//       String newStr = reverseSTR(str);
//
//        System.out.println(newStr);
//    }
//
//    public static String reverseSTR(String str){
//        StringBuilder sb=new StringBuilder(str);
//        sb.reverse();
//        return sb.toString();
//    }

//way2
    public static void main(String[] args) {

        String str = "the sky is blue";
      String newOne= reverseSTR(str);
        System.out.println(newOne);

    }

    public static String reverseSTR(String str)
    {
        char[] c = str.toCharArray();

        for (int i = c.length - 1; i >= 0; i--)
        {

            System.out.print(c[i]);
        }
        return str;
    }
}
