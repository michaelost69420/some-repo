package BasicSyntaxConditionalStatementsandLoopsMoreExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char character = word.charAt(i);
            newWord += character;
        }

        System.out.println(newWord);
    }
}
