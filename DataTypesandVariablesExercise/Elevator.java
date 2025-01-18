package DataTypesandVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        int capasity = Integer.parseInt(sc.nextLine());

        int peopleLeft = people % capasity;

        int courses;
        if (peopleLeft >= 1) {
            courses = people / capasity + 1;
        } else {
            courses = people / capasity;
        }

        System.out.println(courses);
    }
}
