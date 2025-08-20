import java.util.Scanner;

public class DecemalToBinary {


    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter Your number:");

            int newnum=number.nextInt();
        System.out.println(binary(newnum));

//        System.out.println("Enter Your number:");
//        int newnums=number.nextInt();
//        System.out.println(decimalToBinary(newnums));



    }

    public static String binary(int number) {

        String remainder= " ";


        while (number > 0) {

            remainder= (number % 2) + remainder;//remainder
            number = number / 2;

        }

        return remainder;
    }

//    public static String decimalToBinary(int num) {
//        String digits = "0123456789ABCDEF";
//        StringBuilder hex = new StringBuilder();
//
//        while (num > 0) {
//            int digit = num % 16;
//            hex.insert(0, digits.charAt(digit));;
//            num = num / 16;
//        }
//
//        return hex.toString();
//    }




    }
