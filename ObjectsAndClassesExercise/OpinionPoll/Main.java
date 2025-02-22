package ObjectsAndClassesExercise.OpinionPoll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");

            Person person = new Person(command[0], Integer.parseInt(command[1]));

            if (Integer.parseInt(command[1]) > 30) {
                System.out.println(person);
            }
        }
    }
}
