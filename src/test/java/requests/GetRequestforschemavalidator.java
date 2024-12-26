package requests;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class GetRequestforschemavalidator {



    @Test
    public  void getTest() {
        //    ValidatableResponse res = given().get("http://localhost:8000/1").then().statusCode(200);

        Response res = given().queryParam("id", 345).queryParam("abc", "value").get("http://localhost:8000/users");
        //Response res = given().get("http://localhost:8000/users/3");

        res.prettyPrint();


        //validate schema

     res.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));



    }}
