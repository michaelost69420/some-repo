package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    private static int oddAndEvenMultiplication(String number) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '-') {
                continue;
            }
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (num % 2 == 0) {
                sum += num;
            } else {
                sum1 += num;
            }
        }
        return sum * sum1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(oddAndEvenMultiplication(sc.nextLine()));
    }
}
