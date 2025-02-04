package MethodsExercise;

import java.util.Scanner;

public class NxNMatrix {

    private static void square (int amount) {
        for (int i = 1; i <= amount; i++) {
            for (int j = 1; j <= amount; j++) {
                System.out.print(amount + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        square(Integer.parseInt(sc.nextLine()));
    }
}
