package MethodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    private static void isNegative (int number) {
        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number == 0){
            System.out.println("The number 0 is zero.");
        } else {
            System.out.printf("The number %d is positive.", number);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        isNegative(Integer.parseInt(sc.nextLine()));
    }
}
