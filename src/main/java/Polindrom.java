import java.util.Scanner;

public class Polindrom {

    public static void main(String[] args) {
        Scanner insertWord = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter word");
        String newP = "civic";//"asddas"
        String newWord = insertWord.nextLine();
       Boolean str = Boolean.valueOf(String.valueOf(Palindrome(newWord)));

        if(str==true)
        {
            System.out.println("This is Polindrom word "+newWord);
        }else
            System.out.println("This is not Polindrom word "+newWord);

    }

    public static boolean Palindrome(String word) {
        int a=0;
        int b=word.length()-1;
//        String word = "asddas";

        while (a<b) {
            if (word.charAt(a) != word.charAt(b))
                return false;
//            System.out.println("This is not Polindrom word "+word);
            a++;
            b--;
        }
//        System.out.println("This is Polindrom word "+word);
        return true;

 }

}
//
//
//   int currentnumber = 23000;
//   String newnum = String.valueOf(currentnumber%10);
//   String newnumres = String.valueOf(currentnumber/10);
//
//    System.out.println(newnumres);
//
//
//
