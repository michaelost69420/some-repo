package MidExam;

import java.util.*;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int mainPoint = Integer.parseInt(sc.nextLine());

        String type = sc.nextLine();

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == mainPoint) {
                continue;
            }

            if (type.equals("cheap")) {
                if (numbers[i] < numbers[mainPoint]) {
                    if (i < mainPoint) {
                        leftSum += numbers[i];
                    } else {
                        rightSum += numbers[i];
                    }
                }
            } else {
                if (numbers[i] >= numbers[mainPoint]) {
                    if (i < mainPoint) {
                        leftSum += numbers[i];
                    } else {
                        rightSum += numbers[i];
                    }
                }
            }
        }

        if (leftSum >= rightSum) {
            System.out.printf("Left - %d", leftSum);
        } else {
            System.out.printf("Right - %d", rightSum);
        }
    }
}
