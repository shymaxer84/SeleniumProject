import java.util.Arrays;

public class TestClassJavaTrainigs {

        public static void main(String[] args) {
             int num1[] = {1, 2, 3, 0, 0, 0};
             int num2[] = {2, 5, 6};
               int nums[]= merge(num1, num2);




            System.out.println(Arrays.toString(nums));

            int b[] = { 3, 1, 2 };
//            int a[] = { 1,8,6,2,5,4,8,3,7 };


//            System.out.println(maxArea(a));
            System.out.println(maxArea(b));


        }

public static int[] merge(int[] num1, int[] num2)
{
//    num1 = new int[]{1, 2, 3, 0, 0, 0};
//    num2 = new int[]{2, 5, 6};
    for(int i = 0; i < num1.length; i++) {
        if(num1[i] == 0) {
            for(int j = 0; j < num2.length; j++) {
                num1[i] = num2[j];
                i++;  // Move to the next position in nums1
            }
        }
    }



    return num1;
}

    public static int maxArea(int[] a)
    {

        int Area = 0;

        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                Area = Math.max(
                        Area, Math.min(a[i], a[j]) *
                                (j - i));
            }
        }
        return Area;
    }

}

