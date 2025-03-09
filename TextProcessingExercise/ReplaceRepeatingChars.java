package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder txt = new StringBuilder(sc.nextLine());

        for (int i = 0; i < txt.length(); i++) {
            char currentChar = txt.charAt(i);
            try {
                while (txt.charAt(i + 1) == currentChar) {
                    txt.deleteCharAt(i + 1);
                }
            } catch (Exception e) {
                System.out.println(txt);
            }
        }

    }
}
