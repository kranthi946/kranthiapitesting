package requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)    // if we put this annotation , then which are null wont be added to the body
//@JsonInclude(JsonInclude.Include.NON_EMPTY)

@JsonPropertyOrder(value = {"first_name","jobs","lastname"})

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonPropertyOrder(alphabetic = true)
public class EmployeePOJO {
    //plain old java object

    //{} -> class file
    // [] -> list<TYPE>

    private int id;
    private String firstName;
    private String lastName;

    @JsonIgnore
    private String email;
private List<Marks> marks;

public EmployeePOJO() {}
    public EmployeePOJO(int id, String firstName, String lastName, String email, List<Marks> marks, Favfood favfood, List<String> jobs) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.marks = marks;
        this.favfood = favfood;
        this.jobs = jobs;
    }

    public List<Marks> getMarks() {
        return marks;
    }

    public void setMarks(List<Marks> marks) {
        this.marks = marks;
    }

    public List<String> getJobs() {
        return jobs;
    }

    public EmployeePOJO(int id, String firstName, String lastName, String email, Favfood favfood, List<String> jobs) {




        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.favfood = favfood;
        this.jobs = jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }

    private Favfood favfood;

    private List<String> jobs;


    public Favfood getFavfood() {
        return favfood;
    }

    public void setFavfood(Favfood favfood) {
        this.favfood = favfood;
    }

    @Override
    public String toString() {
        return "EmployeePOJO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", favfood=" + favfood +
                ", jobs=" + jobs +
                '}';
    }

    public EmployeePOJO(int id, String firstName, String lastName, String email, Favfood favfood) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.favfood = favfood;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
