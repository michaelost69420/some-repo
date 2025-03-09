package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sequencesOfText = sc.nextLine().split("\\s+");

        double sum = 0;
        for (String string : sequencesOfText) {
            double number = calculationOfNumbersAndLetters(string);

            sum += number;
        }

        System.out.printf("%.2f", sum);
    }

    private static double calculationOfNumbersAndLetters (String currentStr) {
        char starterLetter = currentStr.charAt(0);
        double number = Double.parseDouble(currentStr.substring(1, currentStr.length() - 1));
        char endingLetter = currentStr.charAt(currentStr.length() - 1);

        if (Character.isUpperCase(starterLetter)) {
            number /= (starterLetter - 64);
        } else {
            number *= (starterLetter - 96);
        }

        if (Character.isUpperCase(endingLetter)) {
            number -= (endingLetter - 64);
        } else {
            number += (endingLetter - 96);
        }

        return number;
    }
}
