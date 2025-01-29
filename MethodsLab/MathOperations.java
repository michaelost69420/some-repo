package MethodsLab;

import java.util.Scanner;

public class MathOperations {
    private static int operation (int n1, String operator, int n2) {
        int result = 0;
        switch (operator) {
            case "+" -> result = n1 + n2;
            case "-" -> result = n1 - n2;
            case "*" -> result = n1 * n2;
            case "/" -> result = n1 / n2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(operation(Integer.parseInt(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
    }
}
