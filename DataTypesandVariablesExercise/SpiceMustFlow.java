package DataTypesandVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yield = Integer.parseInt(sc.nextLine());

        int days = 0;
        int spices = 0;
        while (yield >= 100) {

            spices += yield;

            spices -= 26;

            days++;

            yield -= 10;
        }

        if (spices < 26) {
            spices = 0;
        } else {
            spices -= 26;
        }

        System.out.printf("%d%n%d", days, spices);
    }
}
