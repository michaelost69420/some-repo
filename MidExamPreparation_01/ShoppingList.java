package MidExamPreparation_01;

import java.util.*;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split("!")).collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Urgent" -> {
                    if (!numbers.contains(command[1])) {
                        numbers.addFirst(command[1]);
                    }
                }
                case "Unnecessary" -> numbers.remove(command[1]);
                case "Correct" -> {
                    if (numbers.contains(command[1])) {
                        int indexOf = numbers.indexOf(command[1]);
                        numbers.set(indexOf, command[2]);
                    }
                }
                case "Rearrange" -> {
                    if (numbers.contains(command[1])) {
                        String item = command[1];
                        numbers.remove(command[1]);
                        numbers.addLast(item);
                    }
                }
            }

            input = sc.nextLine();
        }

        System.out.println(String.join(", ", numbers));
    }
}
