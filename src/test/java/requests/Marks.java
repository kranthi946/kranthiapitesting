package requests;

public class Marks {
    private String exam = null; // Initialize to null (optional)
    private int tamil;
    private int english;


    public Marks() {}
    // Constructor
    public Marks(String exam, int tamil, int english) {
        this.exam = exam; // Use 'this' to differentiate between field and parameter
        this.tamil = tamil;
        this.english = english;
    }

    // Getters and Setters
    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public int getTamil() {
        return tamil;
    }

    public void setTamil(int tamil) {
        this.tamil = tamil;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "exam='" + exam + '\'' +
                ", tamil=" + tamil +
                ", english=" + english +
                '}';
    }
}
