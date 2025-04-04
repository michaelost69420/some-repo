package ProgrammingFundamentalsFinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, Integer> productsWithTheirQuantity = new LinkedHashMap<>();
        int countOfSoldItems = 0;
        while (!input.equals("Complete")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Receive" -> {
                    if (Integer.parseInt(command[1]) > 0) {
                        if (productsWithTheirQuantity.containsKey(command[2])) {
                            int currentQuantity = productsWithTheirQuantity.get(command[2]);
                            productsWithTheirQuantity.put(command[2], currentQuantity + Integer.parseInt(command[1]));
                        } else {
                            productsWithTheirQuantity.put(command[2], Integer.parseInt(command[1]));
                        }
                    }
                }
                case "Sell" -> {
                    if (!productsWithTheirQuantity.containsKey(command[2])) {
                        System.out.printf("You do not have any %s.%n", command[2]);
                    } else {
                        if (Integer.parseInt(command[1]) > productsWithTheirQuantity.get(command[2])) {
                            System.out.printf("There aren't enough %s. You sold the last %d of them.%n", command[2], productsWithTheirQuantity.get(command[2]));
                            countOfSoldItems += productsWithTheirQuantity.get(command[2]);
                            productsWithTheirQuantity.remove(command[2]);
                        } else if (Integer.parseInt(command[1]) < productsWithTheirQuantity.get(command[2])) {
                            countOfSoldItems += Integer.parseInt(command[1]);
                            int currentQuantity = productsWithTheirQuantity.get(command[2]);
                            productsWithTheirQuantity.put(command[2], currentQuantity - Integer.parseInt(command[1]));
                            System.out.printf("You sold %d %s.%n", Integer.parseInt(command[1]), command[2]);
                        } else {
                            countOfSoldItems += Integer.parseInt(command[1]);
                            productsWithTheirQuantity.remove(command[2]);
                            System.out.printf("You sold %d %s.%n", Integer.parseInt(command[1]), command[2]);
                        }
                    }
                }
            }

            input = sc.nextLine();
        }

        productsWithTheirQuantity.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.printf("All sold: %d goods", countOfSoldItems);
    }
}
