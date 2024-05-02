import org.json.JSONArray;
import org.json.JSONObject;

public class JsonObjects {

    public static void main(String[] args) {

     Object json =  createJsonObject();
        System.out.println(json);
    }

    public static Object createJsonObject()
    {
        JSONArray ja = new JSONArray();
        ja.put(Boolean.TRUE);
        ja.put("lorem ipsum");

        JSONObject jo = new JSONObject();
        jo.put("name", "jon doe");
        jo.put("age", "22");
        jo.put("city", "chicago");

        ja.put(jo);

//        return null;
        return ja;
    }
}
