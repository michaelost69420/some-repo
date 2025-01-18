package DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int key = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            char character = sc.nextLine().charAt(0);
            char newCharacter = (char) (character + key);

            System.out.print(newCharacter);
        }
    }
}
