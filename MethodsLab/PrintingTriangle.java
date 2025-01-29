package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {

    private static void Triangle (int index) {
        for (int i = index - 1; i >= 0; i--) {
            for (int j = 1; j <= index - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int count = 0;
        for (int i = index - 1; i >= 1; i--) {
            count++;
            for (int j = 1; j <= index - count; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle(Integer.parseInt(sc.nextLine()));

    }
}
