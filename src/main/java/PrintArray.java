import java.util.Arrays;
import java.util.Scanner;

public class PrintArray{
    public static void main(String[] args) {
//        Example1

//        int[] a = new int[3];   // int[] a ={1,2,3,};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the elements of the array: ");
//
//        int i;
//        int l;
//        for (i = 0; i<a.length; i++) {
//            a[i] = input.nextInt();
//
//        }

//        for (i = 0; i<a.length;i++)
//        {
//
//
//        }
//        System.out.println("The Array is:"+ Arrays.toString(a));

//        Example 2
            int newArray[] = new int[0];


        System.out.println("The Array is:"+ Arrays.toString(PrintArray(newArray)));




    }

    public static int[] PrintArray(int[] arr){

        arr = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        int i;
        for (i = 0; i<arr.length; i++) {
            arr[i] = input.nextInt();

        }
        for (i = 0; i<arr.length;i++)
        {
            if (arr[i]==3&&arr[i]==5)
            {
                System.out.println("FizzBuzz");
            } else if (arr[i]==3) {
                
            }

        }
       Arrays.sort(arr);
        return arr;
    }


}
