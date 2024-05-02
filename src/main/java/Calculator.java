import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    static int result =0;
    static char yourChoiece = 0;
    public static void main(String[] args) {

                int timesToTry =0;

        while (true)

                {    int operator, num1, num2;
                    System.out.println("1 - Add \n2 - Substruct \n3 - Multiply \n4 - Divide");
                    System.out.print("Choose the Operator :");
                    Scanner sc = new Scanner(System.in);
                    operator = sc.nextInt();
                    System.out.println("Enter first number :");
                    num1 = sc.nextInt();

                    System.out.println("Enter second number :");
                    num2 = sc.nextInt();


                    switch (operator) {

                        case 1:
                            result = num1 + num2;
                            break;

                        case 2:
                            result = num1 - num2;
                            break;

                        case 3:
                            result = num1 * num2;
                            break;

                        case 4:
                            result = num1 / num2;
                            break;

                        default:
                            System.out.println("Enter operator is not valid");
                    }

                    System.out.println("Result is :" + result);
                    timesToTry++;

                        if (timesToTry==2) {

                            System.out.println("Do you want to continue(Y|N)");

                                    Scanner ssc = new Scanner(System.in);
                                    yourChoiece = ssc.next().charAt(0);
                                   if (yourChoiece == 'Y' || yourChoiece == 'y')
                                   {

                                       continue;
                                   }
                                   else {
//
                                       System.out.println("Have a nice day!!!");
                                   }

                                    break;

                        }













//                    while (yourChoiece=='Y'||yourChoiece=='y');

                }


    }





   

}
