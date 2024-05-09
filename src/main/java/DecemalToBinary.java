import java.util.Scanner;

public class DecemalToBinary {


    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter Your number:");

            int newnum=number.nextInt();
        System.out.println(binary(newnum));

    }

    public static String binary(int number) {

        String binarynum = " ";


        while (number > 0) {

            binarynum = (number % 2) + binarynum;
            number = number / 2;

        }

        return binarynum;
    }
}
