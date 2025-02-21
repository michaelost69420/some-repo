package ObjectsAndClassesLab.Students;

public class Student {

    public String firstName;
    public String lastName;
    public int age;
    public String hometown;

    public Student(String firstName_, String lastName_, int age_, String hometown_) {
        age = age_;
        hometown = hometown_;
        firstName = firstName_;
        lastName = lastName_;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHometown() {
        return hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
