package ObjectsAndClassesExercise.OpinionPoll;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString () {
        return name + " - " + age;
    }
}
