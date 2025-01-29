package MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {

    private static int area (int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(area(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
    }
}
