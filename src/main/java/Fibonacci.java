public class Fibonacci {

    public static void main(String[] args) {

        int n = 20 , firstNum= 0, secondNum = 1;
        int nextNum;

        for (int i = 1; i<=n ;i++)
        {
            System.out.print(firstNum + ",");
            nextNum = firstNum + secondNum;
            firstNum =secondNum;
            secondNum =nextNum;


        }
    }
}
