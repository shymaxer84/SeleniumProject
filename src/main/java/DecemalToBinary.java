import java.util.Scanner;

public class DecemalToBinary {


    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter Your number:");

            int newnum=number.nextInt();
        System.out.println(binary(newnum));

    }

    public static String binary(int number) {

        String remainder= " ";


        while (number > 0) {

            remainder= (number % 2) + remainder;//remainder
            number = number / 2;

        }

        return remainder;
    }
}
