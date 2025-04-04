package ProgrammingFundamentalsFinalExam1;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<Integer>> aHeroesInfo = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            aHeroesInfo.putIfAbsent(command[0], new ArrayList<>());
            aHeroesInfo.get(command[0]).add(0, Integer.parseInt(command[1]));
            aHeroesInfo.get(command[0]).add(1, Integer.parseInt(command[2]));
        }

        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" - ");

            switch (command[0]) {
                case "CastSpell" -> {
                    if (aHeroesInfo.get(command[1]).get(1) >= Integer.parseInt(command[2])) {
                        int currentMP = aHeroesInfo.get(command[1]).get(1);
                        aHeroesInfo.get(command[1]).set(1, currentMP - Integer.parseInt(command[2]));
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", command[1], command[3], aHeroesInfo.get(command[1]).get(1));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", command[1], command[3]);
                    }
                }
                case "TakeDamage" -> {
                    if (aHeroesInfo.get(command[1]).getFirst() - Integer.parseInt(command[2]) > 0) {
                        int currentHP = aHeroesInfo.get(command[1]).getFirst();
                        aHeroesInfo.get(command[1]).set(0, currentHP - Integer.parseInt(command[2]));
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", command[1], Integer.parseInt(command[2]), command[3], aHeroesInfo.get(command[1]).getFirst());
                    } else {
                        aHeroesInfo.remove(command[1]);
                        System.out.printf("%s has been killed by %s!%n", command[1], command[3]);
                    }
                }
                case "Recharge" -> {
                    int amountOfMpAdded;
                    if (Integer.parseInt(command[2]) + aHeroesInfo.get(command[1]).get(1) <= 200) {
                        amountOfMpAdded = Integer.parseInt(command[2]);
                        aHeroesInfo.get(command[1]).set(1, Integer.parseInt(command[2]) + aHeroesInfo.get(command[1]).get(1));
                    } else {
                        amountOfMpAdded = 200 - aHeroesInfo.get(command[1]).get(1);
                        aHeroesInfo.get(command[1]).set(1, 200);
                    }
                    System.out.printf("%s recharged for %d MP!%n", command[1], amountOfMpAdded);
                }
                case "Heal" -> {
                    int amountOfMpAdded;
                    if (Integer.parseInt(command[2]) + aHeroesInfo.get(command[1]).getFirst() <= 100) {
                        amountOfMpAdded = Integer.parseInt(command[2]);
                        aHeroesInfo.get(command[1]).set(0, Integer.parseInt(command[2]) + aHeroesInfo.get(command[1]).getFirst());
                    } else {
                        amountOfMpAdded = 100 - aHeroesInfo.get(command[1]).getFirst();
                        aHeroesInfo.get(command[1]).set(0, 100);
                    }
                    System.out.printf("%s healed for %d HP!%n", command[1], amountOfMpAdded);
                }
            }

            input = sc.nextLine();
        }

        for (Map.Entry<String, List<Integer>> stringListEntry : aHeroesInfo.entrySet()) {
            System.out.println(stringListEntry.getKey());
            System.out.println("  HP: " + stringListEntry.getValue().getFirst());
            System.out.println("  MP: " + stringListEntry.getValue().get(1));
        }
    }
}
