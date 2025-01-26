package ArraysExercise;

import java.util.*;

public class EqualSums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int leftSum = 0;
        int rightSum = 0;
        int i;
        boolean isTheRightElement = false;
        for (i = 0; i < numbers.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                leftSum += numbers[j];
            }


            for (int j = 0; j < numbers.length; j++) {
                if (j > i) {
                    rightSum += numbers[j];
                }
            }
            if (leftSum == rightSum) {
                isTheRightElement = true;
                break;
            }
            leftSum = 0;
            rightSum = 0;
        }
        if (isTheRightElement) {
            System.out.print(i);
        } else {
            System.out.print("no");
        }
    }
}
