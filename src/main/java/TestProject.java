import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;

public class TestProject {


    JSONParser loadJson = new JSONParser();
    JSONObject obj;

    {
        try {
            obj = (JSONObject) loadJson.parse(new FileReader("financial_report_example1-shachar.pdf_1715862826.8031025 (1).json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    JSONArray tables = (JSONArray) obj.get("tables");
    Object table = tables.get(1);
    JSONObject rows = (JSONObject) table;
    JSONArray getrows = (JSONArray) rows.get("rows");

    JSONArray clarification_text = (JSONArray) obj.get("clarification_text");
    Object text = clarification_text.get(0);
    JSONObject texts = (JSONObject) text;

    @Test
    public void Test1() {


        Object getrow2 = getrows.get(2);
        JSONObject row2 = (JSONObject) getrow2;
        Object last_year = row2.get("last_year");
        Object this_year = row2.get("this_year");
        Assert.assertEquals(last_year, "6,991,952");//מזומנים בקופה ובבנקים
        Assert.assertEquals(this_year, "7,151,489"); //מזומנים בקופה ובבנקים

    }

    @Test(dependsOnMethods = "Test1")
    public void Test2() {
        Object meta = obj.get("metadata");
        JSONObject metadata = (JSONObject) meta;
        Object corporation_name = metadata.get("corporation_name");
        Assert.assertEquals(corporation_name, "אלקלוב אלרחימה");//validate name
        Object financial_report_language = metadata.get("financial_report_language");
        Assert.assertEquals(financial_report_language, "Hebrew");//validate language

    }

    @Test(dependsOnMethods = "Test2")
    public void Test3() {

        Object getrow3 = getrows.get(3);
        JSONObject row3 = (JSONObject) getrow3;
        Object lastyear = row3.get("last_year");
        Object thisyear = row3.get("this_year");
        Assert.assertEquals(lastyear, "272,419");//חייבים שונים והוצאות מראש
        Assert.assertEquals(thisyear, "635,684"); //חייבים שונים והוצאות מראש

    }

    @Test(dependsOnMethods = "Test3")
    public void Test4() {
        Object getText = texts.get("text");

        Assert.assertEquals(getText, "א. העמותה נרשמה משפטית כעמותה אצל רשם העמותות במשרד העמותות במשרד הפנים\n" +
                "לפי חוק העמותות התש\"מ – 1980 ) ביום 28 בספטמבר 2016 למטרות מתן סיוע לנזקקים,\n" +
                "ארגון פעילות חינוכיות ותרבותיות לאנשים נזקקים, מתן סיוע הומנטארי לחולים\n" +
                "במגזר הערבי- כולל שטחי הרשות הפלסטנית.\n" +
                "העמותה החלה את פעילותה בפועל בחודש דצמבר 2016.\n" +
                ",-\n" +
                "ב. עיקר פעילותה של העמותה סיוע למשפחות עניות ונזקקות בשטחי הרשות הפלסטית, רוב\n" +
                "התמיכה סיוע על ידי אימוץ ותמיכה במשפחה על ידי התורם.\n" +
                "העמותה מחלקת מוצרי מזון,בשר, אוכל, תרופות, סיוע בשיפוץ בתים, - בשטחי הרשות-\n" +
                "העמותה מסייעת לפליטים הסורים, במזון, אוכל, אוהלים, דיור, חימום וכי.");


    }

}