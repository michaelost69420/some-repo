package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder txt = new StringBuilder(sc.nextLine());

        int totalPower = 0;
        for (int i = 0; i < txt.length(); i++) {

            if (txt.charAt(i) == '>') {
                int currentPower = Integer.parseInt(String.valueOf(txt.charAt(i + 1)));
                totalPower += currentPower;
            } else if (totalPower > 0) {
                txt.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }

        System.out.println(txt);
    }
}
