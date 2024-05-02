import java.util.Scanner;

public class CheckpointTest {

    public static void main(String[] mess) {
        Scanner input_message= new Scanner(System.in);
        System.out.println("Enter word");
        String newWord = input_message.nextLine();
//         String message = "Hello My Name is Dmitry";

        int K = 15;

            for(int i =0; i<newWord.length();i++){

            }
            if(newWord.length()>15){
                 String result = newWord.replaceAll(newWord.substring(15),".........");
                System.out.println(result);
            }

//        Boolean str = Boolean.valueOf(String.valueOf(printRect(5,10,'x'));
//        if(str = true) {
//            System.out.println(str);
//        }
////            printRect(5,10,'x');
//        }
//
//        private static boolean printRect(int width, int height, char marker) {
//            printHorizontal(width,marker);
//            for(int j=0;j<height-2;j++) {
//                printVertical(width,marker);
//            }
//            printHorizontal(width,marker);
//            return false;
//        }
//
//        private static void printVertical(int width, char marker) {
//            System.out.print(marker);
//            for (int j = 0; j < width-2; j++) {
//                System.out.print(' ');
//            }
//            System.out.println(marker);
//        }
//
//        private static void printHorizontal(int width,char marker) {
//            for (int j = 0; j < width-1; j++) {
//                System.out.print(marker);
//            }
//            System.out.println(marker);
       int i = 0;
       int j = 0;
       int[] block = new int[]{2, 4, 6, 9};
          solution(block);

    }
   public static void solution(int[] blocks) {
       // Implement your solution here
       int i = 0;
      int j = 0;

       for (i = 0; i < blocks.length; i++) {
           for (j = i + 1; j < blocks.length; j++) {
                System.out.println("distance between blocks " + i + " and blocks " + j + " is " + (blocks[j] - blocks[i]));
           }
       }
   }

}
