package MidExamPreparation_02;

import java.util.*;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we get a bunch of numbers separated by " "
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = sc.nextLine();
        //2.we loop as usual until we don't recive "end"
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                //3.swaps 2 indexes out of the numbers array
                case "swap" -> {
                    int temp = numbers[Integer.parseInt(command[1])];
                    numbers[Integer.parseInt(command[1])] = numbers[Integer.parseInt(command[2])];
                    numbers[Integer.parseInt(command[2])] = temp;
                }
                //4.multiplies 2 indexes out of the numbers array and add the new value at the first index
                case "multiply" -> {
                    int multipliedValue = numbers[Integer.parseInt(command[1])] * numbers[Integer.parseInt(command[2])];
                    numbers[Integer.parseInt(command[1])] = multipliedValue;
                }
                //5.decrease all the numbers in the numbers array by 1
                case "decrease" -> allNumsDecreasedBy1(numbers);
            }

            input = sc.nextLine();
        }

        //6.we print out the result with each element separated by ", "
        System.out.println(Arrays.toString(numbers).replace("[", "").replace("]", ""));
    }

    public static void allNumsDecreasedBy1 (int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] -= 1;
        }
    }
}
