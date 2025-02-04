package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {

    private static String middle (String txt) {

        String middle = "";

        if (txt.length() % 2 == 0) {
            middle += "" + txt.charAt(txt.length() / 2 - 1) + txt.charAt(txt.length() / 2);
        } else {
            middle += txt.charAt(txt.length() / 2);
        }

        return middle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(middle(sc.nextLine()));
    }
}
