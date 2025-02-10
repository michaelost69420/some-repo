package ListsMoreExercise;

import java.util.*;

public class CarRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int middle = numbers.length / 2;

        double left = 0;
        double right = 0;
        for (int i = 0; i < middle; i++) {
            if (numbers[i] == 0) {
                left *= 0.8;
            } else {
                left += numbers[i];
            }
        }

        for (int i = numbers.length - 1; i >= middle + 1; i--) {
            if (numbers[i] == 0) {
                right *= 0.8;
            } else {
                right += numbers[i];
            }
        }

        if (left < right) {
            System.out.printf("The winner is left with total time: %.1f", left);
        } else if (right < left) {
            System.out.printf("The winner is right with total time: %.1f", right);
        }
    }
}
