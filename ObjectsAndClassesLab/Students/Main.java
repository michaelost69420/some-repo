package ObjectsAndClassesLab.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (!Exists(students, command[0], command[1])) {
                students.add(new Student(command[0], command[1], Integer.parseInt(command[2]), command[3]));
            } else {
                Student student = getStudent(students, command[0], command[1]);

                student.setFirstName(command[0]);
                student.setLastName(command[1]);
                student.setAge(Integer.parseInt(command[2]));
                student.setHometown(command[3]);
            }

            input = sc.nextLine();
        }

        String town = sc.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(town)) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + student.getAge() + " years old");
            }
        }
    }

    private static boolean Exists (List<Student> students, String firstName, String secondName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(secondName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent (List<Student> students, String firstName, String lastName) {
        Student currentStudent = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                currentStudent = student;
            }
        }
        return currentStudent;
    }
}
