package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we get all the items in our inventory separated by ", "
        List<String> numbers = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String input = sc.nextLine();
        //2.we loop through the commands until we don't get "Craft!"
        while (!input.equals("Craft!")) {
            String[] command = input.split(" - ");

            switch (command[0]) {
                //3.we add the item at the end of the list if it doesn't exist
                case "Collect" -> {
                    if (!numbers.contains(command[1])) {
                        numbers.add(command[1]);
                    }
                }
                //4.we remove an item if it exists
                case "Drop" -> numbers.remove(command[1]);
                //5.we get a new item and a old item and if we have the old item in the list we add the crafted item afterward
                case "Combine Items" -> {
                    String[] items = command[1].split(":");

                    if (numbers.contains(items[0])) {
                        int indexOfItem1 = numbers.indexOf(items[0]);

                        numbers.add(indexOfItem1 + 1, items[1]);
                    }
                }
                //6.we switch the possition of the existing element on the last index
                case "Renew" -> {
                    if (numbers.contains(command[1])) {
                        int indexOf = numbers.indexOf(command[1]);
                        numbers.addLast(command[1]);
                        numbers.remove(indexOf);
                    }
                }
            }

            input = sc.nextLine();
        }
        //7.after we print the items left in the list
        System.out.println(String.join(", ", numbers));
    }
}
