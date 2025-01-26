package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] input = sc.nextLine().split(" ");
        while (!input[0].equals("end")) {

            switch (input[0]) {
                case "swap" -> {
                    int number = numbers[Integer.parseInt(input[1])];
                    numbers[Integer.parseInt(input[1])] = numbers[Integer.parseInt(input[2])];
                    numbers[Integer.parseInt(input[2])] = number;
                }
                case "multiply" -> {
                    int multiplication = numbers[Integer.parseInt(input[1])] * numbers[Integer.parseInt(input[2])];
                    numbers[Integer.parseInt(input[1])] = multiplication;
                }
                case "decrease" -> {
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }
                }
            }

            input = sc.nextLine().split(" ");
        }

        String numberz = String.join(", ",
                Arrays.stream(numbers)
                        .mapToObj(String::valueOf)
                        .toArray(String[]::new));

        System.out.println(numberz);
    }
}
