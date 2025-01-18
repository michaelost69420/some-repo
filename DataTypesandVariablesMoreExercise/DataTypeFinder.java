package DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;
        while (!(input = sc.nextLine()).equals("END")) {
            if (isDouble(input)) {
                System.out.printf("%s is floating point type%n", input);
            } else if (isInteger(input)) {
                System.out.printf("%s is integer type%n", input);
            } else if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }

        }
    }
    public static boolean isDouble(String input) {
        try {
            Float.parseFloat(input);
            return input.contains(".");
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
