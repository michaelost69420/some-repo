package MethodsMoreExercise;

import java.util.*;

public class ArrayManipulator {

    public static int[] exchange(int[] numbers, int index) {

        int[] updated = new int[numbers.length];
        if (!(index >= 0 && index <= numbers.length - 1)) {
            System.out.println("Invalid index");
            return numbers;
        } else {
            int[] first = Arrays.copyOfRange(numbers, 0, index + 1);
            int[] second = Arrays.copyOfRange(numbers, index + 1, numbers.length);
            System.arraycopy(second, 0, updated, 0, second.length);
            System.arraycopy(first, 0, updated, second.length, first.length);
        }

        return updated;
    }

    public static void maxOrMin (int[] numbers, String input , String input1) {

        int index = -1;
        int value = (input1.equals("max")) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if ((input.equals("even") && numbers[i] % 2 == 0) || (input.equals("odd") && numbers[i] % 2 != 0)) {
                if ((input1.equals("max") && numbers[i] >= value) ||
                        (input1.equals("min") && numbers[i] <= value)) {
                    value = numbers[i];
                    index = i;
                }
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }



    }
    public static void firstOrLast (int[] numbers, String input, int count, String input1) {

        int currentCount = 0;
        LinkedList<Integer> result = new LinkedList<>();
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            if (input.equals("first")) {
                for (int number : numbers) {
                    if (input1.equals("even")) {
                        if (number % 2 == 0) {
                            if (currentCount < count) {
                                result.add(number);
                                currentCount++;
                            } else {
                                break;
                            }
                        }
                    } else {
                        if (number % 2 != 0) {
                            if (currentCount < count) {
                                result.add(number);
                                currentCount++;
                            } else {
                                break;
                            }
                        }
                    }
                }
            } else {
                for (int i = numbers.length - 1; i >= 0; i--) {
                    if (input1.equals("even")) {
                        if (numbers[i] % 2 == 0) {
                            if (currentCount < count) {
                                result.add(numbers[i]);
                                currentCount++;
                            } else {
                                break;
                            }
                        }
                    } else {
                        if (numbers[i] % 2 != 0) {
                            if (currentCount < count) {
                                result.add(numbers[i]);
                                currentCount++;
                            } else {
                                break;
                            }
                        }
                    }
                }
                Collections.reverse(result);
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String[] updatedInput = input.split(" ");

            switch (updatedInput[0]) {
                case "exchange" -> numbers = exchange(numbers, Integer.parseInt(updatedInput[1]));
                case "max", "min" -> maxOrMin(numbers, updatedInput[1], updatedInput[0]);
                case "first", "last" -> firstOrLast(numbers, updatedInput[0], Integer.parseInt(updatedInput[1]), updatedInput[2]);
            }

            input = sc.nextLine();

        }
        System.out.println(Arrays.toString(numbers));
    }
}
