package ObjectsAndClassesExercise.Students;

public class Student {

    private String firstName;
    private String secondName;
    private double grade;

    public Student(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public String toString () {
        return String.format("%s %s: %.2f", firstName, secondName, grade);
    }

    public double getGrade() {
        return grade;
    }
}
