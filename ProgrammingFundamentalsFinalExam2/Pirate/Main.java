package ProgrammingFundamentalsFinalExam2.Pirate;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, List<Integer>> aCitiesInfo = new LinkedHashMap<>();
        while (!input.equals("Sail")) {
            String[] command = input.split("\\|\\|");

            if (aCitiesInfo.containsKey(command[0])) {
                int currentPopulation = aCitiesInfo.get(command[0]).getFirst();
                int currentGold = aCitiesInfo.get(command[0]).get(1);
                aCitiesInfo.get(command[0]).set(0, currentPopulation + Integer.parseInt(command[1]));
                aCitiesInfo.get(command[0]).set(1, currentGold + Integer.parseInt(command[2]));
            } else {
                aCitiesInfo.put(command[0], new ArrayList<>());
                aCitiesInfo.get(command[0]).add(0, Integer.parseInt(command[1]));
                aCitiesInfo.get(command[0]).add(1, Integer.parseInt(command[2]));
            }

            input = sc.nextLine();
        }

        String input1 = sc.nextLine();
        while (!input1.equals("End")) {
            String[] command = input1.split("=>");

            if (command[0].equals("Plunder")) {

                int currentPopulation = aCitiesInfo.get(command[1]).getFirst();
                int currentGold = aCitiesInfo.get(command[1]).get(1);
                aCitiesInfo.get(command[1]).set(0, currentPopulation - Integer.parseInt(command[2]));
                aCitiesInfo.get(command[1]).set(1, currentGold - Integer.parseInt(command[3]));
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", command[1], Integer.parseInt(command[3]), Integer.parseInt(command[2]));

                if (aCitiesInfo.get(command[1]).getFirst() <= 0 || aCitiesInfo.get(command[1]).get(1) <= 0) {
                    aCitiesInfo.remove(command[1]);
                    System.out.printf("%s has been wiped off the map!%n", command[1]);
                }
            } else {
                if (Integer.parseInt(command[2]) < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    int currentGold = aCitiesInfo.get(command[1]).get(1);
                    aCitiesInfo.get(command[1]).set(1, currentGold + Integer.parseInt(command[2]));
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", aCitiesInfo.get(command[1]).get(1) - currentGold , command[1], aCitiesInfo.get(command[1]).get(1));
                }
            }

            input1 = sc.nextLine();
        }

        if (!aCitiesInfo.isEmpty()) {
            System.out.println("Ahoy, Captain! There are " + aCitiesInfo.size() + " wealthy settlements to go to:");
            for (Map.Entry<String, List<Integer>> stringListEntry : aCitiesInfo.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", stringListEntry.getKey(), stringListEntry.getValue().getFirst(), stringListEntry.getValue().get(1));
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
