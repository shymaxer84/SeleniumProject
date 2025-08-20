import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.reverseOrder;

public class SeleniumTestsArrays {
//        @Test(description = "getsource")
//        public void Tests(){
//
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver() ;
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait instead Thread.sleep(10000);
//            driver.get("https://tutorialsninja.com/demo/");
//           String pageSource= driver.getPageSource();
//            System.out.println(pageSource);
//        }


    public static void main(String[] args) {
        Integer[] outputarr;
        int i;
        boolean num =false;
        int k;
        Integer[] arr = new Integer[5];
        Scanner input = new Scanner(System.in);
        for( i =0;i<arr.length;i++) {
            System.out.print("Input Number:");
           arr[i] =input.nextInt();
            System.out.println(" ");

        }
        outputarr =arr;
//        Arrays.sort(arr);
        System.out.println("The Array is:"+ Arrays.toString(arr));

        for(int j=0;j< arr.length;j++){

           k= arr.length-1;
          if (arr[j]<k){
              --k;


          }


        }
        Arrays.sort(arr, Collections.reverseOrder());
        num =true;
        System.out.println("The Array is sorted from upper to lower to :"+ Arrays.toString(arr) + num);


        for(int j=0;j< outputarr.length;j++){

            k= arr.length+1;
            if (arr[j]<k){
                ++k;

            }


        }
        Arrays.sort(arr);
        num =true;
        System.out.println("The Array is sorted from lower to upper :"+ Arrays.toString(arr) + num);
    }













}
