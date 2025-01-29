package MethodsLab;

import java.util.Scanner;

public class Grades {
    private static void Grade (double grade) {
        if (grade >= 2.00 && grade <= 2.99) {
            System.out.println("Fail");
        } else if (grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade <= 4.49) {
            System.out.println("Good");
        } else if (grade <= 5.49) {
            System.out.println("Very good");
        } else if (grade <= 6.00) {
            System.out.println("Excellent");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Grade(Double.parseDouble(sc.nextLine()));
    }
}
