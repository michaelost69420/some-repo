package FinalExamSolving;

import java.util.*;

public class ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> aHeroAndHisSpells = new LinkedHashMap<>();
        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Enroll" -> {
                    if (aHeroAndHisSpells.containsKey(command[1])) {
                        System.out.printf("%s is already enrolled.%n", command[1]);
                    } else {
                        aHeroAndHisSpells.put(command[1], new ArrayList<>());
                    }
                }
                case "Learn" -> {
                    if (!aHeroAndHisSpells.containsKey(command[1])) {
                        System.out.printf("%s doesn't exist.%n", command[1]);
                    } else {
                        if (aHeroAndHisSpells.get(command[1]).contains(command[2])) {
                            System.out.printf("%s has already learnt %s.%n", command[1], command[2]);
                        } else {
                            aHeroAndHisSpells.get(command[1]).add(command[2]);
                        }
                    }
                }
                case "Unlearn" -> {
                    if (!aHeroAndHisSpells.containsKey(command[1])) {
                        System.out.printf("%s doesn't exist.%n", command[1]);
                    } else {
                        if (!aHeroAndHisSpells.get(command[1]).contains(command[2])) {
                            System.out.printf("%s doesn't know %s.%n", command[1], command[2]);
                        } else {
                            aHeroAndHisSpells.get(command[1]).remove(command[2]);
                        }
                    }
                }
            }

            input = sc.nextLine();
        }

        System.out.println("Heroes:");
        for (Map.Entry<String, List<String>> stringListEntry : aHeroAndHisSpells.entrySet()) {
            System.out.println("== " + stringListEntry.getKey() + ": " + String.join(", ", stringListEntry.getValue()));
        }
    }
}
