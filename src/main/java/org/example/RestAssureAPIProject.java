package org.example;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class RestAssureAPIProject {

    @Test(priority = 1)
    public void getUsersInPageTwo()
    {


       Response responce = given().when().get("https://reqres.in/api/users?page=2");
       int actualStatus = responce.statusCode();
        Assert.assertEquals(actualStatus,200);
    }

    @Test(dependsOnMethods = "getUsersInPageTwo")
    public void getSingleUser()
    {


        Response responce = given().when().get("https://reqres.in/api/users?page=2");
        ResponseBody responseBody = responce.getBody();
        String actualResponseBody = responseBody.asString();
        Assert.assertTrue(actualResponseBody.contains("Michael"));


        int actualStatus = responce.getStatusCode();


    }
}
