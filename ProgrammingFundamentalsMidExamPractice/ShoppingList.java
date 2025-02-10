package ProgrammingFundamentalsMidExamPractice;

import java.util.*;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        •	"Urgent {item}" - add the item at the start of the list.  If the item already exists, skip this command.
        •	"Unnecessary {item}" - remove the item with the given name, only if it exists in the list. Otherwise, skip this command.
        •	"Correct {oldItem} {newItem}" - if the item with the given old name exists, change its name with the new one. Otherwise, skip this command.
        •	"Rearrange {item}" - if the grocery exists in the list, remove it from its current position and add it at the end of the list. Otherwise, skip this command.
         */

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
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i).equals(command[1])) {
                                numbers.set(i, command[2]);
                                break;
                            }
                        }
                    }
                }
                case "Rearrange" -> {
                    if (numbers.contains(command[1])) {
                        String resentValue = command[1];
                        numbers.remove(command[1]);
                        numbers.add(resentValue);
                    }
                }
            }
            input = sc.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }
}
