import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSequence {

    public static void main(String[] args) {

        int [] arr ={4,6,5,8,9,7,1,99,2,100,3,9,8};
        int arr1= longestSequence(arr);
        System.out.println(arr1);
    }
    public static int longestSequence(int[] nums)

    {
        int max = 0;
        Set<Integer> set1 = new HashSet<>();
        for(int num:nums){


            set1.add(num);
        }

        for (int num:nums){

            if(!set1.contains(num - 1))
            {
                int start =num;
                while (set1.contains(start)){

                    start++;
                }
                max = Math.max(max,start-num);
            }

        }
        return max;



    }
}
