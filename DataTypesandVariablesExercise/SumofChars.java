package DataTypesandVariablesExercise;

import java.util.Scanner;

public class SumofChars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            char character = sc.nextLine().charAt(0);

            sum += character;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
