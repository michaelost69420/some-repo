package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortandPrintArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        int[] sortedStats = new int[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            for (int j = 0; j < name.length(); j++) {
                char character = name.charAt(j);

                if (character == 'a' || character == 'e' || character == 'o' || character == 'u' || character == 'i'
                || character == 'A' || character == 'E' || character == 'O' || character == 'U' || character == 'I') {
                    sum += ((int)character) * name.length();
                } else {
                    sum += ((int)character) / name.length();
                }
            }
            sortedStats[i] = sum;
            sum = 0;
        }
        Arrays.sort(sortedStats);

        Arrays.stream(sortedStats).forEach(System.out::println);
    }
}
