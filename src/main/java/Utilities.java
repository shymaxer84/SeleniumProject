import java.util.Date;

public class Utilities extends Base{

    public static String generateEmailWithTimeStamp() {
        Date date = new Date();

//        System.out.println(date.toString().replace(" ","_").replace(":","_"));
//        System.out.println(date);

        return date.toString().replace(" ","_").replace(":","_");

    }
}
