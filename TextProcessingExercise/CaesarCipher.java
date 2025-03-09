package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            System.out.print((char) (txt.charAt(i) + 3));
        }
    }
}
