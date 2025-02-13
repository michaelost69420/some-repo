package MidExamPreparation_03;

import java.util.*;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we get the sequences of the values of the targets into a list
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        //2.We loop util we don't receive "End"
        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                //3.when we shot a target we either take its value or completely remove it from the list
                case "Shoot" -> {
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) <= numbers.size() - 1) {
                        numbers.set(Integer.parseInt(command[1]), numbers.get(Integer.parseInt(command[1])) - Integer.parseInt(command[2]));
                        //4. if the value in that element is 0 than we remove it as shot
                        if (numbers.get(Integer.parseInt(command[1])) <= 0) {
                            numbers.remove(Integer.parseInt(command[1]));
                        }
                    }
                }
                case "Add" -> {
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) <= numbers.size() - 1) {
                        numbers.add(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    } else {
                        System.out.println("Invalid placement!");
                    }
                }
                case "Strike" -> {
                    if (Integer.parseInt(command[1]) - Integer.parseInt(command[2]) >= 0 && Integer.parseInt(command[1]) + Integer.parseInt(command[2]) <= numbers.size() - 1) {
                        List<Integer> subNumbers = numbers.subList(Integer.parseInt(command[1]) - Integer.parseInt(command[2]), Integer.parseInt(command[1]) + Integer.parseInt(command[2]) + 1);
                        numbers.removeAll(subNumbers);
                    } else {
                        System.out.println("Strike missed!");
                    }
                }
            }

            input = sc.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size() - 1) {
                System.out.print(numbers.get(i) + "|");
            } else {
                System.out.print(numbers.get(i));
            }
        }
    }
}
