package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {

    private static int theSmallest (int n1, int n2, int n3) {
        return Math.min(n3,Math.min(n1, n2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(theSmallest(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
    }
}
