package requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.error.Mark;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PostrequestUsingPOJO {



    @Test
    public void pojotest() {



//        List<String> dinner = new ArrayList<>();
//
//
//        dinner.add("dosa");
//        dinner.add("biryani");
//        Favfood favfood = null;
//        favfood = new Favfood("chapathi", "biryani",dinner);





        String sem = "Semester 1"; // Declare and initialize sem
        Marks m1 = new Marks(sem, 80, 60); // Correct instantiation
        Marks m2 = new Marks(sem, 84, 60); // Correct instantiation

        List<Marks> lm = Arrays.asList(m1,m2);

       Favfood favfood = new Favfood("chapathi", "biryani", Arrays.asList("biryani", "chapathi","beer"));

       // EmployeePOJO e = new EmployeePOJO(345, "g", "k", "d@mailinator.com", lm ,favfood, Arrays.asList("trainer","tester","boxer"));
        EmployeePOJO e = new EmployeePOJO(345, "g", null, "d@mailinator.com", lm ,favfood, Arrays.asList("trainer","tester","boxer"));

        Response r = given()

                .header("Content-Type", ContentType.JSON)
                .log().all()


                .body(e)


                .post("http://localhost:8000/users");


        r.then().statusCode(201);
        r.prettyPrint();


    }
}
