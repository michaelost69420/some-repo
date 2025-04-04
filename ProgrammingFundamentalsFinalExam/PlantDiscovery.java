package ProgrammingFundamentalsFinalExam;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> aPlantsRarity = new LinkedHashMap<>();
        Map<String, List<Double>> aPlantsRatings = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split("<->");
            aPlantsRarity.put(command[0], Integer.parseInt(command[1]));
            aPlantsRatings.put(command[0], new ArrayList<>());
        }

        String input = sc.nextLine();
        while (!input.equals("Exhibition")) {
            String[] command = input.split(": ");

            switch (command[0]) {
                case "Rate" -> {
                    String[] command1 = command[1].split(" - ");
                    if (!aPlantsRarity.containsKey(command1[0])) {
                        System.out.println("error");
                    } else {
                        aPlantsRatings.get(command1[0]).add(Double.parseDouble(command1[1]));
                    }

                }
                case "Update" -> {
                    String[] command1 = command[1].split(" - ");

                    if (aPlantsRarity.containsKey(command1[0])) {
                        aPlantsRarity.put(command1[0], Integer.parseInt(command1[1]));
                    } else {
                        System.out.println("error");
                    }
                }
                case "Reset" -> {
                    if (aPlantsRarity.containsKey(command[1])) {
                        aPlantsRatings.get(command[1]).clear();
                    } else {
                        System.out.println("error");
                    }
                }

            }

            input = sc.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> stringIntegerEntry : aPlantsRarity.entrySet()) {
            System.out.printf("- %s; Rarity: %d;", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            double sum = 0;
            for (int i = 0; i < aPlantsRatings.get(stringIntegerEntry.getKey()).size(); i++) {
                sum += aPlantsRatings.get(stringIntegerEntry.getKey()).get(i);
            }
            if (sum != 0) {
                System.out.printf(" Rating: %.2f%n", sum / aPlantsRatings.get(stringIntegerEntry.getKey()).size());
            } else {
                System.out.print(" Rating: 0.00\n");
            }
            sum = 0;
        }
    }
}
