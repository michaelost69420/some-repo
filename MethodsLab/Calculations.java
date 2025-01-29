package MethodsLab;

import java.util.Scanner;

public class Calculations {

    private static int calculation (String action, int n1, int n2) {
        int result = 0;
        switch (action) {
            case "add" -> result = n1 + n2;
            case "multiply" -> result = n1 * n2;
            case "subtract" -> result = n1 - n2;
            case "divide" -> result = n1 / n2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calculation(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
    }
}
