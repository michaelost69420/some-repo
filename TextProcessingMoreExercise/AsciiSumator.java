package TextProcessingMoreExercise;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstCharacter = sc.nextLine().charAt(0);
        char secondCharacter = sc.nextLine().charAt(0);
        String sequenceOfCharacters = sc.nextLine();

        int sum = 0;
        for (char characters : sequenceOfCharacters.toCharArray()) {
            if ((int) characters > (int) firstCharacter && (int) characters < (int) secondCharacter) {
                sum += (int) characters;
            }
        }

        System.out.println(sum);
    }
}
