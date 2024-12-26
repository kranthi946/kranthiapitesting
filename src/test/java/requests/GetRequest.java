package requests;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetRequest {



    @Test
    public  void getTest() {
        //    ValidatableResponse res = given().get("http://localhost:8000/1").then().statusCode(200);

        Response res = given().queryParam("id", 345).queryParam("abc", "value").get("http://localhost:8000/users");
        //Response res = given().get("http://localhost:8000/users/3");

        res.prettyPrint();

        // System.out.println(res.statusCode());

        // System.out.println(res.asString());
        // System.out.println(res.body().asString());
        //  System.out.println(res.jsonPath().getString("first_name"));

//from employee class we are deserialising the data

        // for deserialising to happen for each class empty constructor of that class should be present

//The line EmployeePOJO[] employees = res.as(EmployeePOJO[].class); uses an array of EmployeePOJO because the JSON response contains an array of employee objects. In JSON, arrays are represented with square brackets [], indicating multiple items, which corresponds to an array in Java.
//
//Here's a breakdown of why an array is used here:
//
//Multiple Objects in JSON: Since your JSON response includes multiple employee objects, it's natural to map them to a Java array (or alternatively, a List<EmployeePOJO>, which would work as well).
//
//Jackson Library: Jackson, used by RestAssured, can automatically deserialize JSON arrays into Java arrays of objects, such as EmployeePOJO[].
//
//Array Syntax in Java: Declaring EmployeePOJO[] employees tells Java that employees will store multiple EmployeePOJO instances, matching the JSON structure provided.


      //Certainly! Let’s look at two JSON examples to illustrate the difference between having an array of employee objects and a single employee object.
        //
        //1. JSON with a Single Employee Object
        //If the JSON does not contain an array of employee objects, it would look like this:
        //
        //json
        //Copy code
        //{
        //  "id": 1,
        //  "name": "John Doe",
        //  "department": "Engineering",
        //  "position": "Software Engineer",
        //  "salary": 75000
        //}
        //In this case, we would directly map this JSON response to a single EmployeePOJO object in Java:
        //
        //java
        //Copy code
        //EmployeePOJO employee = res.as(EmployeePOJO.class);
        //2. JSON with an Array of Employee Objects
        //If the JSON contains multiple employee objects (an array of employees), it would look like this:
        //
        //json
        //Copy code
        //[
        //  {
        //    "id": 1,
        //    "name": "John Doe",
        //    "department": "Engineering",
        //    "position": "Software Engineer",
        //    "salary": 75000
        //  },
        //  {
        //    "id": 2,
        //    "name": "Jane Smith",
        //    "department": "Marketing",
        //    "position": "Marketing Specialist",
        //    "salary": 68000
        //  },
        //  {
        //    "id": 3,
        //    "name": "Mike Johnson",
        //    "department": "Sales",
        //    "position": "Sales Manager",
        //    "salary": 72000
        //  }
        //]
        //In this case, the JSON data represents an array of employee objects. Here, each object within the array is an EmployeePOJO instance. To map this JSON to Java, you’d use an array or a list:
        //
        //java
        //Copy code
        //EmployeePOJO[] employees = res.as(EmployeePOJO[].class);
        //Or if you prefer a List:
        //
        //java
        //Copy code
        //List<EmployeePOJO> employees = Arrays.asList(res.as(EmployeePOJO[].class));
        //In summary:
        //
        //Single object JSON corresponds to EmployeePOJO in Java.
        //Array of objects JSON corresponds to EmployeePOJO[] or List<EmployeePOJO> in Java.
        EmployeePOJO[] employees = res.as(EmployeePOJO[].class);




        // Iterate over each employee and print the details
        for (EmployeePOJO employee : employees) {

            System.out.println("Employee ID: " + employee.getId());

            System.out.println("Marks: " + employee.getMarks());

            System.out.println("-----------------------------");
            //why it is nt running because this body doesnt have this key
            // List<String> jobs =  res.jsonPath().getList("favfoods.dinner");


            // System.out.println(jobs);

            //System.out.println(res.getStatusCode() + res.getTime() + res.getContentType() + res.getBody().prettyPrint() );

            // res.headers().forEach(System.out::println);
        }
    }}
