package MidExamPreparation_03;

import java.util.*;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we receive a sequence of numbers(targets) we shoot at
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //2.Until "End" we keep getting indexes from the console
        int count = 0;
        String input;
        while (!(input = sc.nextLine()).equals("End")) {
            int targetedIndex = Integer.parseInt(input);

            //3.we check if a target was already shot or not but we check first if the index is inside our array
            if (targetedIndex >= 0 && targetedIndex <= numbers.length - 1) {
                if (numbers[targetedIndex] != -1) {
                    count++;
                    int currentTarget = numbers[targetedIndex];
                    numbers[targetedIndex] = -1;
                    //4.we check if the currentTarget is less or bigger than a current value we are looping through
                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i] != -1) {
                            if (numbers[i] <= currentTarget) {
                                numbers[i] += currentTarget;
                            } else {
                                numbers[i] -= currentTarget;
                            }
                        }
                    }
                }
            }
        }

        //5.we print out the result to the console
        System.out.printf("Shot targets: %d -> ", count);
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
    }
}
