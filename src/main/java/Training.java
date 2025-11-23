import net.bytebuddy.TypeCache;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Training {

    public static void main(String[] args) {

        int[] arr = new int[5];
        int i;
        System.out.println("enter number to arr");
        Scanner input = new Scanner(System.in);

        for( i=0;i< arr.length;i++)
        {
            arr[i]=input.nextInt();


        }

        for( i=0;i< arr.length;i++)
        {
            Arrays.sort(arr);
//            if(arr[i]>arr[i+1]||arr[i]==arr[i+1]){
//
//                int temp=arr[i+1];
//                int temp2 =arr[i];
//                arr[i]=temp;
//                arr[i+1]=temp2;
//            }

        }



        System.out.println(Arrays.toString(arr));



    }

//    public void NumToString(){
//        int i;
//        int num = 1223556676;
//        String nums = Integer.toString(num);
//        for( i=0;i< nums.length();i++)
//        {
//           if( nums.charAt(i)> nums.charAt(i)-1){
//
//               char temp = (char) (nums.charAt(i)-1);
//               char temp1 = nums.charAt(i);
//
//           }
//
//
//        }
//    }



    public WebDriver driver;
    @BeforeMethod
    public void setUP(){





        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/");

    }

    @Test
    public void  faiforate(){

    driver.findElement(By.className("Navbar_link__3Blki menu-item")).click();
    }
    @AfterTest
    public void tearDown(){
        if(driver !=null)  {
            driver.quit();

        }
    }




}
