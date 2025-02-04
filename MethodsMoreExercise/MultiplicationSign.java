package MethodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign {

    public static String isPositive (int n1, int n2 , int n3) {

        int countN = 0;

        if (n1 < 0) {
            countN++;
        }
        if (n2 < 0) {
            countN++;
        }
        if (n3 < 0) {
            countN++;
        }

        if ((n1 == 0 || n2 == 0 || n3 == 0)) {
            return "zero";
        } else {
            if (countN % 2 == 0) {
                return "positive";
            } else {
                return "negative";
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(isPositive(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
    }
}
