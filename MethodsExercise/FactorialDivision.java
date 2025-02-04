package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {

    private static long factorialValue (int amount) {
        long result = 1;

        for (int i = 1; i <= amount; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("%.2f", (double) factorialValue(Integer.parseInt(sc.nextLine())) / factorialValue(Integer.parseInt(sc.nextLine())));
    }
}
