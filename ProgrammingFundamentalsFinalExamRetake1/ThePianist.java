package ProgrammingFundamentalsFinalExamRetake1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, HashMap<String, String>> pieceKeyAndComposer = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split("\\|");
            pieceKeyAndComposer.putIfAbsent(command[0], new HashMap<>());
            pieceKeyAndComposer.get(command[0]).put(command[2], command[1]);
        }

        String input = sc.nextLine();

        while (!input.equals("Stop")) {
            String[] command = input.split("\\|");

            switch (command[0]) {
                case "Add" -> {
                    if (pieceKeyAndComposer.containsKey(command[1])) {
                        System.out.printf("%s is already in the collection!%n", command[1]);
                    } else {
                        pieceKeyAndComposer.putIfAbsent(command[1], new HashMap<>());
                        pieceKeyAndComposer.get(command[1]).put(command[3], command[2]);
                        System.out.printf("%s by %s in %s added to the collection!%n", command[1], command[2], command[3]);
                    }
                }
                case "Remove" -> {
                    if (pieceKeyAndComposer.containsKey(command[1])) {
                        pieceKeyAndComposer.remove(command[1]);
                        System.out.printf("Successfully removed %s!%n", command[1]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    }
                }
                case "ChangeKey" -> {
                    if (pieceKeyAndComposer.containsKey(command[1])) {
                        String currentComposer = "";
                        String key = "";
                        for (Map.Entry<String, String> stringStringEntry : pieceKeyAndComposer.get(command[1]).entrySet()) {
                            currentComposer = stringStringEntry.getValue();
                            key = stringStringEntry.getKey();
                        }
                        pieceKeyAndComposer.get(command[1]).remove(key);
                        pieceKeyAndComposer.get(command[1]).put(command[2], currentComposer);
                        System.out.printf("Changed the key of %s to %s!%n", command[1], command[2]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    }
                }
            }

            input = sc.nextLine();
        }

        for (Map.Entry<String, HashMap<String, String>> stringHashMapEntry : pieceKeyAndComposer.entrySet()) {
            System.out.print(stringHashMapEntry.getKey() + " -> ");
            for (Map.Entry<String, String> stringStringEntry : stringHashMapEntry.getValue().entrySet()) {
                System.out.println("Composer: " + stringStringEntry.getValue() + ", " + "Key: " + stringStringEntry.getKey());
            }
        }
    }
}
