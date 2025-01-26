package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }
            for (int j = 0; j < numbers.length; j++) {
                if (j > i) {
                    if (!(numbers[i] > numbers[j])) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.print(numbers[i] + " ");
            }
            count = 0;
        }
    }
}
