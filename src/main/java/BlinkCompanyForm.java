

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class BlinkCompanyForm {

    public static void main(String[] args)  {

        System.out.println("Welcome, choose an action:");
        JSONParser loadJson = new JSONParser();
        JSONArray obj = null;
        JSONObject questions;
        JSONObject newObject = new JSONObject();
        ObjectMapper objectMapper = new ObjectMapper();


        boolean flag = true;


        while (flag) {

            Scanner input = new Scanner(System.in);
            System.out.println("1. import a form\n" +
                    "2. fill in a form");
            int yourChoose = input.nextInt();


            switch (yourChoose) {
                case 1:

                    try {
                        obj = (JSONArray) loadJson.parse(new FileReader("RestrunForm.json"));

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Form is imported");
                    break;
                case 2:
                    try {

                        questions = (JSONObject) obj.get(0);
                        Object question1 = questions.get("question1");
                        System.out.println(question1);
                        int yourChoose2 = input.nextInt();
                        if (yourChoose2 == 1) {
                            questions = (JSONObject) obj.get(1);
                            Object question2 = questions.get("question2");
                            System.out.println(question2);
                        }

                        questions = (JSONObject) obj.get(1);
                        Object field = questions.get("field");

                        Scanner sc = new Scanner(System.in);
                        String newDish = sc.nextLine();


                        questions = (JSONObject) obj.get(2);
                        Object question3 = questions.get("question3");
                        System.out.println(question3);

                        Object field2 = questions.get("field");
                        String toppings = sc.nextLine();

                        newObject.put(field, newDish);
                        newObject.put(field2, toppings);

                        objectMapper.writeValue(new File("NewRestrunForm.json"), newObject);
                        System.out.println("Thank you for filling the form! Here is the filled form:");
                        System.out.println(newObject);
                        flag = false;
                        break;


                    } catch (Exception e) {

                        System.out.println("Import the form before");
                    }

                default:
                    System.out.println("The action is wrong, repeat please");


            }

        }


    }
}