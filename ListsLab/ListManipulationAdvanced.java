package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        •	Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"
        •	Print even – print all the numbers that are even separated by a space
        •	Print odd – print all the numbers that are oddly separated by a space
        •	Get sum – print the sum of all the numbers
         */

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Contains" -> {
                    if (numbers.contains(Integer.parseInt(command[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                }
                case "Print" -> {
                    switch (command[1]) {
                        case "even" -> {
                            for (Integer number : numbers) {
                                if (number % 2 == 0) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                        }
                        case "odd" -> {
                            for (Integer number : numbers) {
                                if (number % 2 != 0) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                        }
                    }
                }
                case "Get" -> {
                    if (command[1].equals("sum")) {
                        int sum = 0;
                        for (Integer number : numbers) {
                            sum += number;
                        }
                        System.out.println(sum);
                    }
                }
                case "Filter" -> {
                    switch (command[1]) {
                        case ">" -> {
                            for (Integer number : numbers) {
                                if (number > Integer.parseInt(command[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                        }
                        case "<" -> {
                            for (Integer number : numbers) {
                                if (number < Integer.parseInt(command[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                        }
                        case ">=" -> {
                            for (Integer number : numbers) {
                                if (number >= Integer.parseInt(command[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                        }
                        case "<=" -> {
                            for (Integer number : numbers) {
                                if (number <= Integer.parseInt(command[2])) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                        }
                    }
                }
            }

            input = sc.nextLine();
        }
    }
}
