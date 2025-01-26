package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {

            if (i == numbers.length - 1) {
                if (n < 4) {
                    numbers[i] = n;
                    break;
                }
            }

            n -= 4 - numbers[i];
            numbers[i] = 4;

        }

        if (n > 4) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", n);
        } else {
            System.out.println("The lift has empty spots!");
        }

        Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
    }
}
