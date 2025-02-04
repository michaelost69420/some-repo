package MethodsExercise;

import java.util.Scanner;

public class TopNumber {

    public static void topNumbers (int n1) {

        String digits = "";
        int oddDigit = 0;
        int sum = 0;

        for (int i = 1; i <= n1; i++) {

            digits += i;

            for (int j = 0; j < digits.length(); j++) {
                int i1 = Integer.parseInt(String.valueOf(digits.charAt(j)));
                sum += i1;
                if (i1 % 2 != 0) {
                    oddDigit = j;
                }
            }

            if (oddDigit != 0 && sum % 8 == 0) {
                System.out.println(i);
            }
            digits = "";
            sum = 0;
            oddDigit = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        topNumbers(Integer.parseInt(sc.nextLine()));
    }
}
