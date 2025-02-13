package MidExamPreparation_01;

import java.util.*;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("Craft!")) {
            String[] command = input.split(" - ");

            switch (command[0]) {
                case "Collect" -> {
                    if (!numbers.contains(command[1])) {
                        numbers.add(command[1]);
                    }
                }
                case "Drop" -> numbers.remove(command[1]);
                case "Combine Items" -> {
                    String[] items = command[1].split(":");
                    if (numbers.contains(items[0])) {
                        int indexOf = numbers.indexOf(items[0]);
                        numbers.add(indexOf + 1, items[1]);
                    }
                }
                case "Renew" -> {
                    if (numbers.contains(command[1])) {
                        numbers.remove(command[1]);
                        numbers.add(command[1]);
                    }
                }
            }

            input = sc.nextLine();
        }

        System.out.println(String.join(", ", numbers));
    }
}
