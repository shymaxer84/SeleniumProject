import java.util.Date;

public class Utilities extends Base{
    public static final int  IMPLICIT_WAIT_TIME = 10;
    public  static final int PAGE_WAIT_TIME = 5;

    public static String generateEmailWithTimeStamp() {
        Date date = new Date();

//        System.out.println(date.toString().replace(" ","_").replace(":","_"));
//        System.out.println(date);

        return date.toString().replace(" ","_").replace(":","_");

    }
}
