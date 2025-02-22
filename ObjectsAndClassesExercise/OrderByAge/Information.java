package ObjectsAndClassesExercise.OrderByAge;

public class Information {

    private String name;
    private String ID;
    private int age;

    public Information(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String toString () {
        return String.format("%s with ID: %s is %d years old.", name, ID, age);
    }

    public int getAge() {
        return age;
    }
}
