package ObjectsAndClassesExercise.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");

            Student student = new Student(command[0], command[1], Double.parseDouble(command[2]));
            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade).reversed());

        students.forEach(System.out::println);
    }
}
