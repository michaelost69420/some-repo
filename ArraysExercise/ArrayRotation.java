package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            int first = numbers[0];

            for (int j = 0; j < numbers.length; j++) {

                if (j == numbers.length - 1) {
                    numbers[numbers.length - 1] = first;
                    break;
                }

                numbers[j] = numbers[j + 1];
            }
        }

        Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
    }
}
