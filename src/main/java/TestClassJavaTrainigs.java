import java.util.Arrays;

public class TestClassJavaTrainigs {

        public static void main(String[] args) {
            int[] num2 = new int[0];
            int[] num1 = new int[0];
           int nums[] = merge(num1, num2);

            System.out.println(Arrays.toString(nums));
        }

public static int[] merge(int[] num1, int[] num2)
{
    num1 = new int[]{1, 2, 3, 0, 0, 0};
    num2 = new int[]{2, 5, 6};
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
}
