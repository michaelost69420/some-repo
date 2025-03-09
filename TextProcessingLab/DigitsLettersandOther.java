package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        String digits = "";
        String symbols = "";
        String letters = "";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                digits += string.charAt(i);
            } else if (Character.isLetter(string.charAt(i))) {
                letters += string.charAt(i);
            } else {
                symbols += string.charAt(i);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
