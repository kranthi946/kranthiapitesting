package requests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DelRequest {



    @Test
    public  void getTest(){


        Response res = given().queryParam("id",3).queryParam("abc" ,"value").log().all().delete("http://localhost:8000/users");

        res.prettyPrint();

    }
}
