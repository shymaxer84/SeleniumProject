import java.util.Scanner;

public class Figures {


    public static void main(String[] args) {

        stars();
        stars2();

    }

    public static void stars() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);

        for (int i = 1; i <=n;i++)
        {
            for(int j = 1; j <=n-i;j++)

                System.out.print(" ");

            for(int j =1 ;j<=(i*2)-1;j++)

                System.out.print(c);

            System.out.println();
        }

    }
    public static void stars2() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);

        for (int i = 1; i <=n;i++)
        {
            for(int j = 1; j <=n-i;j++)

                System.out.print(" ");

            for(int j =1 ;j<=(i*2)-1;j++)
                if(i==n)
                System.out.print(c);
                else
                    if(j==1||j==(i*2)-1)
                        System.out.print(c);
                    else

                         System.out.print(" ");

            System.out.println();
        }

    }



}
