package ArraysExercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int twoSum;
        LinkedList<Integer> moreSum = new LinkedList<>();
        boolean containsLengthOfLessThan2 = false;
        while (moreSum.size() != 2) {
            if (numbers.length <= 2) {
                containsLengthOfLessThan2 = true;
                break;
            }
            moreSum.clear();
            for (int j = 0; j < numbers.length - 1; j++) {
                moreSum.add(numbers[j] + numbers[j + 1]);
            }
            numbers = moreSum.stream().mapToInt(Integer::intValue).toArray();
        }

        if (!containsLengthOfLessThan2) {
            twoSum = moreSum.get(0) + moreSum.get(1);
        } else {
            if (numbers.length == 1) {
                twoSum = numbers[0];
            } else {
                twoSum = numbers[0] + numbers[1];
            }
        }


        System.out.println(twoSum);

    }
}
