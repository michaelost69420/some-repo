package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Add" -> numbers.add(Integer.parseInt(command[1]));
                case "Insert" -> {
                    if (Integer.parseInt(command[2]) >= 0 && Integer.parseInt(command[2]) <= numbers.size() - 1) {
                        numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "Remove" -> {
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) <= numbers.size() - 1) {
                        numbers.remove(Integer.parseInt(command[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "Shift" -> {
                    int count = Integer.parseInt(command[2]);
                    switch (command[1]) {
                        case "left" -> {
                            for (int i = 0; i < count; i++) {
                                int first = numbers.getFirst();
                                numbers.removeFirst();
                                numbers.add(first);
                            }
                        }
                        case "right" -> {
                            for (int i = 0; i < count; i++) {
                                int last = numbers.getLast();
                                numbers.removeLast();
                                numbers.addFirst(last);
                            }
                        }
                    }
                }
            }

            input = sc.nextLine();
        }

        numbers.forEach(n -> System.out.print(n + " "));
    }
}
