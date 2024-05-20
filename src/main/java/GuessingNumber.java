

import java.util.Random;
import java.util.Scanner;


public class GuessingNumber {


    public static void main(String[] args) {
        boolean flag =true;
        Random rand = new Random();
        int secretnum ;
        int newnum = 0;
        int  guess = 0;
        int  count = 1;
        while (flag)
        {
            System.out.println("Type a number for an upper bound:");
            Scanner num = new Scanner(System.in);
                if(num.hasNextInt())
                {


                    System.out.println("Let's play!");
                    flag = false;


                }
                else {

                        System.out.println("Invalid input! Try Again");


                }

            newnum=num.nextInt();




        }

        secretnum = rand.nextInt(1,newnum);

      while (guess!=secretnum)
      {

          System.out.println("Please type a number between 1 and " + newnum +":");
            Scanner input = new Scanner(System.in);
            if(input.hasNextInt())
            {
                guess=input.nextInt();

            }
            if (guess==secretnum)
            {
                System.out.println("You got it!");
            }
            else
            {
                System.out.println("Please try again");
                count += 1;
            }

      }
        System.out.println("It took you"+" "+count+" "+"guesses!");
    }

}
