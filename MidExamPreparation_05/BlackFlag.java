package MidExamPreparation_05;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        •	On the 1st line, you will receive the days of the plunder – an integer number in the range [0…100,000].
        •	On the 2nd line, you will receive the daily plunder – an integer number in the range [0…50].
        •	On the 3rd line, you will receive the expected plunder – a real number in the range [0.0…10000.0].
         */

        //1.we add the required inputs
        int days = Integer.parseInt(sc.nextLine());
        int dailyPlunder = Integer.parseInt(sc.nextLine());
        double expectedPlunder = Double.parseDouble(sc.nextLine());

        double total = 0;
        for (int i = 1; i <= days; i++) {
            total += dailyPlunder;

            if (i % 3 == 0) {
                total += (double) dailyPlunder / 2;
            }

            if (i % 5 == 0) {
                total *= 0.7;
            }
        }

        if (total >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", total);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", (total / expectedPlunder) * 100);
        }
    }
}
