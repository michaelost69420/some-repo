package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {

    private static boolean isPalindrome (String n1) {

        String n1BackWards = "";
        for (int i = n1.length() - 1; i >= 0; i--) {
            n1BackWards += n1.charAt(i);
        }

        return n1BackWards.equals(n1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;
        while (!(input = sc.nextLine()).equals("END")) {

            System.out.println(isPalindrome(input));
        }
    }
}
