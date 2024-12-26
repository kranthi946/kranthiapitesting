package requests;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

//pass it with externalfile

// disadvantage : you cant  get the request from the file and print it on console
// use this only for static data

public class PostRequestUsingJsonFileusingexternalfile {

@Test
    public void test002(){

Response r = given()

        .header("Content-Type", ContentType.JSON)
        .log().all()
        .body(new File("/Users/kranthi/Desktop/Apitesting/src/main/resources/test.json")).post("http://localhost:8000/users");

r.prettyPrint();

    }
}
