package requests;

import java.util.List;

public class Favfood {


    public Favfood() {}
    private String breakfast;
    private String lunch;

    private  List<String> dinner;

    public Favfood(String breakfast) {
        this.breakfast = breakfast;
    }

    @Override
    public String toString() {
        return "Favfood{" +
                "breakfast='" + breakfast + '\'' +
                ", lunch='" + lunch + '\'' +
                ", dinner=" + dinner +
                '}';
    }

    public List<String> getDinner() {
        return dinner;
    }

    public void setDinner(List<String> dinner) {
        this.dinner = dinner;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }


    public Favfood(String breakfast, String lunch, List<String> dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;

        this.dinner = dinner;
    }
}
