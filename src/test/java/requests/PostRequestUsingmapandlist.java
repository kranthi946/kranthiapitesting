package requests;


import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.util.*;

import static io.restassured.RestAssured.given;

//using map and list from java
//{} -> Map interface
//[] -> List


public class PostRequestUsingmapandlist {

    @Test
    public void test003() {


        Map<String, Object> obj = new HashMap<>();

        obj.put("id", 190);
        obj.put("name", "test");
        obj.put("first_name", "kranthi");
        obj.put("last_name", "k");
        obj.put("email", "k@mailinator.com");


        Response r = given()

                .header("Content-Type", ContentType.JSON)
                .log().all()
                .body(obj).post("http://localhost:8000/users");


        r.then().statusCode(201);
        r.prettyPrint();

    }


    @Test
    public void test004() {

//{
//  "id": 6,
//  "first_name": "Alex",
//  "last_name": "Taylor",
//  "email": "alex.taylor@example.com",
//
//  "jobs": ["tester","gcp"],
//  "favfoods": {
//
//    "breakfast" : "idly",
//    "lunch" : "biryani",
//    "dinner": ["chapathi","milk"]
//
//  }
//}
        //serialisers -> converts your lamguage objects ->> byte streams -> json


        //verbose  , not suitable for bery big json files
        //generic type need to be mentioned
        Map<String, Object> obj = new HashMap<>();

        obj.put("id", 101);
        obj.put("name", "test");
        obj.put("first_name", "kranthi");
        obj.put("last_name", "k");
        obj.put("email", "k@mailinator.com");

//List<String> listofjobs = new ArrayList<>();
//
//listofjobs.add("tester");
//listofjobs.add("gcp");
        obj.put("jobs", Arrays.asList("tester", "trianer", "runner"));

//obj.put("jobs",listofjobs);

        Map<String, Object> food = new HashMap<>();
        food.put("breakfast", "idly");
        food.put("lunch", "rice");
        List<String> df = new ArrayList<>();

        df.add("biryani");
        df.add("milk");

        food.put("dinner", "df");

        obj.put("favfood", food);


        Response r = given()

                .header("Content-Type", ContentType.JSON)
                .log().all()
                .body(obj).post("http://localhost:8000/users");


        r.then().statusCode(201);
        r.prettyPrint();

    }


    @Test
    public void test005() {

//{
//  "id": 6,
//  "first_name": "Alex",
//  "last_name": "Taylor",
//  "email": "alex.taylor@example.com",
//
//  "jobs": ["tester","gcp"],
//  "favfoods": {
//
//    "breakfast" : "idly",
//    "lunch" : "biryani",
//    "dinner": ["chapathi","milk"]
//
//  }
//}
        //serialisers -> converts your lamguage objects ->> byte streams -> json


        //verbose  , not suitable for bery big json files
        //generic type need to be mentioned


        JSONObject obj = new JSONObject();


        obj.put("id", 103);
        obj.put("name", "test");
        obj.put("first_name", "kranthi");
        obj.put("last_name", "k");
        obj.put("email", "k@mailinator.com");

        obj.accumulate("email", "abc@mailinator.com");

        obj.append("email", "xyz@mailinator.com");

//List<String> listofjobs = new ArrayList<>();
//
//listofjobs.add("tester");
//listofjobs.add("gcp");

        JSONArray listofjobs = new JSONArray();
        listofjobs.put("tester");
        listofjobs.put("gcp");


        obj.put("jobs", "listofjobs");

//obj.put("jobs",listofjobs);

        JSONObject food = new JSONObject();
        food.put("breakfast", "idly");
        food.put("lunch", "rice");
        JSONArray df = new JSONArray();
        df.put("biryani");
        df.put("milk");

        food.put("dinner", "df");

        obj.put("favfoodss", food);


        Response r = given()

                .header("Content-Type", ContentType.JSON)
                .log().all()

                //converts to string
                // .body(obj.toString())


                //converts json object to map . // jackson will serialise
                .body(obj.toMap())


                .post("http://localhost:8000/users");


        r.then().statusCode(201);
        r.prettyPrint();

    }
}
