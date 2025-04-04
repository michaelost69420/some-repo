package ProgrammingFundamentalsFinalExamRetake2;

import java.util.*;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<Integer>> aCarsInfo = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split("\\|");

            aCarsInfo.putIfAbsent(command[0], new ArrayList<>());
            aCarsInfo.get(command[0]).addFirst(Integer.parseInt(command[1]));
            aCarsInfo.get(command[0]).add(1, Integer.parseInt(command[2]));
        }

        String input = sc.nextLine();
        while (!input.equals("Stop")) {
            String[] command = input.split(" : ");

            switch (command[0]) {
                case "Drive" -> {
                    if (aCarsInfo.get(command[1]).get(1) < Integer.parseInt(command[3])) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int currentMileage = aCarsInfo.get(command[1]).getFirst();
                        int currentFuel = aCarsInfo.get(command[1]).get(1);
                        aCarsInfo.get(command[1]).set(0, currentMileage + Integer.parseInt(command[2]));
                        aCarsInfo.get(command[1]).set(1, currentFuel - Integer.parseInt(command[3]));
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", command[1], Integer.parseInt(command[2]), Integer.parseInt(command[3]));
                    }

                    if (aCarsInfo.get(command[1]).get(0) >= 100000) {
                        aCarsInfo.remove(command[1]);
                        System.out.printf("Time to sell the %s!%n", command[1]);
                    }
                }
                case "Refuel" -> {
                    int filledLiters;
                    if (aCarsInfo.get(command[1]).get(1) + Integer.parseInt(command[2]) <= 75) {
                        aCarsInfo.get(command[1]).set(1, aCarsInfo.get(command[1]).get(1) + Integer.parseInt(command[2]));
                        filledLiters = Integer.parseInt(command[2]);
                    } else {
                        filledLiters = 75 - aCarsInfo.get(command[1]).get(1);
                        aCarsInfo.get(command[1]).set(1, 75);
                    }

                    System.out.printf("%s refueled with %d liters%n", command[1], filledLiters);
                }
                case "Revert" -> {
                    if (aCarsInfo.get(command[1]).getFirst() - Integer.parseInt(command[2]) < 10000) {
                        aCarsInfo.get(command[1]).set(0, 10000);
                    } else {
                        aCarsInfo.get(command[1]).set(0, aCarsInfo.get(command[1]).getFirst() - Integer.parseInt(command[2]));
                        System.out.printf("%s mileage decreased by %d kilometers%n", command[1], Integer.parseInt(command[2]));
                    }

                }
            }

            input = sc.nextLine();
        }

        for (Map.Entry<String, List<Integer>> stringListEntry : aCarsInfo.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", stringListEntry.getKey(), stringListEntry.getValue().getFirst(), stringListEntry.getValue().get(1));
        }
    }
}
