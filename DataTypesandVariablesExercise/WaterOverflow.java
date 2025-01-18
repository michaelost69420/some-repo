package DataTypesandVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int lettersPoured = Integer.parseInt(sc.nextLine());

            sum += lettersPoured;

            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum -= lettersPoured;
            }
        }

        System.out.println(sum);
    }
}
