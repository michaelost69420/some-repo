package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        StringBuilder top = new StringBuilder();
        StringBuilder bottom = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0) {
                top.append(numbers[0]).append(" ");
                bottom.append(numbers[1]).append(" ");
            } else {
                top.append(numbers[1]).append(" ");
                bottom.append(numbers[0]).append(" ");
            }
        }

        System.out.println(top);
        System.out.println(bottom);
    }
}
