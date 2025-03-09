package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sequencesOfStrings = sc.nextLine().split(" ");

        String str1 = sequencesOfStrings[0];
        String str2 = sequencesOfStrings[1];

        int n = Math.min(str1.length(), str2.length());
        int m = (n == str1.length()) ? str2.length() : str1.length();

        int sum = 0;
        int currentIndex = 0;
        for (int i = 0; i < n; i++) {
            sum += str1.charAt(i) * str2.charAt(i);
            currentIndex++;
        }

        for (int j = currentIndex; j < m; j++) {
            int value = (m == str1.length()) ? str1.charAt(j) : str2.charAt(j);

            sum += value;
        }

        System.out.println(sum);
    }
}
