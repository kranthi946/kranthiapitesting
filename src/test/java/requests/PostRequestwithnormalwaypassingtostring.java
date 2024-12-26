package requests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequestwithnormalwaypassingtostring {
//passing json body as string . not recommended
// content type we need to send
    //1. application /json
    //2.text/plain
    //without content type

    // why to pass content type  , if we dont pass what will happen

    @Test
    public void postRequest() {

//      Response res =   given().header("Content-Type","application/json").body("{\n" +
//                "        \"id\": 2032,\n" +
//                "        \"first_name\": \"Jane\",\n" +
//                "        \"last_name\": \"Smith\",\n" +
//                "        \"email\": \"jane.smith@example.com\"\n" +
//                "    }").post("http://localhost:8000/users");

//        Response res =   given().header("Content-Type","text/plain").body("{\n" +
//                "        \"id\": 2032,\n" +
//                "        \"first_name\": \"Jane\",\n" +
//                "        \"last_name\": \"Smith\",\n" +
//                "        \"email\": \"jane.smith@example.com\"\n" +
//                "    }").post("http://localhost:8000/users");

        Response res =   given().body("{\n" +
                "        \"id\": 2333,\n" +
                "        \"first_name\": \"Jane\",\n" +
                "        \"last_name\": \"Smith\",\n" +
                "        \"email\": \"jane.smith@example.com\"\n" +
                "    }").post("http://localhost:8000/users");

      res.prettyPrint();

      System.out.println(res.statusCode());
    }




}
