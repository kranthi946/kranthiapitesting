package requests;


import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

//read req body from an external file and convert to string

//logs the req body into console
//change few parameters in request
//not suitable for request habving lot of dynamic parameters

public class PostRequestUsingJsonFileusingexternalfile1 {

@Test
    public void test002() throws IOException {


  byte[] bytes =   Files.readAllBytes(Paths.get("/Users/kranthi/Desktop/Apitesting/src/main/resources/test.json"));
String rb = new String(bytes);


    Faker faker = new Faker();
    String requestBody = rb
            .replace("6", String.valueOf(faker.number().numberBetween(100, 10000))) // Replace ID
            .replace("first_name", faker.name().firstName()) // Replace first name
            .replace("last_name", faker.name().lastName());
  Response r = given()

        .header("Content-Type", ContentType.JSON)

        .body(requestBody).post("http://localhost:8000/users");
int sc = r.getStatusCode() ;


if(sc == 201){
    System.out.println("user created , method runned sucessfully");

}

//r.prettyPrint();

    }
}
