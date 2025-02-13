package MidExamPreparation_02;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we add our inputs required for our program to work
        int teacher1Performance = Integer.parseInt(sc.nextLine());
        int teacher2Performance = Integer.parseInt(sc.nextLine());
        int teacher3Performance = Integer.parseInt(sc.nextLine());
        int studentCount = Integer.parseInt(sc.nextLine());

        int totalStudentsPerHour = teacher1Performance + teacher2Performance + teacher3Performance;

        //2.we loop through until we don't have enough students
        int i = 0;
        while (studentCount > 0) {
            //3.we give the teachers break every 4 hours
            if (!(i % 4 == 0 && i != 0)) {
                studentCount -= totalStudentsPerHour;
            }

            i++;

            //4.but sometimes the teachers are done with there work at a hour dividable to 4 but we still need to give them a break so we check it with this command
            if (i % 4 == 0 && studentCount <= 0) {
                i++;
                break;
            }
        }

        //4.we print the final result
        System.out.printf("Time needed: %dh.", i);
    }
}
