package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {

    private static void isValidPassword (String password) {

        int count = 0;
        boolean onlyWordsAndNumbers = true;


        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
            if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                onlyWordsAndNumbers = false;
                break;
            }
        }

        if (!(password.length() >= 6 && password.length() <= 10)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!onlyWordsAndNumbers) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (count < 2) {
            System.out.println("Password must have at least 2 digits");
        }

        if ((password.length() >= 6 && password.length() <= 10) && onlyWordsAndNumbers && count >= 2) {
            System.out.println("Password is valid");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        isValidPassword(sc.nextLine());
    }
}
