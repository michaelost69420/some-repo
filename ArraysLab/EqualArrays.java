package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int i;
        int sum = 0;
        boolean isEqual = true;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers1[i]) {
                sum += numbers[i];
            } else {
                isEqual = false;
                break;
            }
        }

        if (!isEqual) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", i);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
