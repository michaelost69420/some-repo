package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i < j) {
                    if (numbers[i] + numbers[j] == n) {
                        System.out.println(numbers[i] + " " + numbers[j]);
                    }
                }
            }
        }
    }
}
