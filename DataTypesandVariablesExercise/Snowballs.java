package DataTypesandVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        /*
        •	On the first line, you will get the snowballSnow – an integer.
        •	On the second line, you will get the snowballTime – an integer.
        •	On the third line, you will get the snowballQuality – an integer.

         */

        int highestSnowballSnow = 0;
        int highestSnowballTime = 0;
        int highestSnowballQuality = 0;
        double highestSnowballValue = 0;
        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());

            double snowballValue = Math.pow((double) snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > highestSnowballValue) {
                highestSnowballValue = snowballValue;
                highestSnowballSnow = snowballSnow;
                highestSnowballQuality = snowballQuality;
                highestSnowballTime = snowballTime;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", highestSnowballSnow, highestSnowballTime, highestSnowballValue, highestSnowballQuality);
    }
}
