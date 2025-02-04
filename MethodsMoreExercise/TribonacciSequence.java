package MethodsMoreExercise;

import java.util.Scanner;

public class TribonacciSequence {

    public static void tribonacciSequence (int amount) {

        String result = "1 1 2 ";

        int n1 = 1;
        int n2 = 1;
        int n3 = 2;
        int sum;
        if (amount == 1) {
            System.out.println("1 ");
        } else if (amount == 2) {
            System.out.println("1 1");
        } else if (amount == 3) {
            System.out.println("1 1 2");
        } else {
            for (int i = 3; i < amount; i++) {
                sum = n1 + n2 + n3;

                result += sum + " ";

                n1 = n2;
                n2 = n3;
                n3 = sum;
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        tribonacciSequence(Integer.parseInt(sc.nextLine()));
    }
}
