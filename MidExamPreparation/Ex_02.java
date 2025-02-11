package MidExamPreparation;

import java.util.*;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we get all values separated by "|"
        String[] numbers = sc.nextLine().split("\\|");

        //2.we loop through each room and till we don't die from the boss also we store our health and bitcoins
        int health = 100;
        int bitcoins = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            String[] command = numbers[i].split(" ");

            switch (command[0]) {
                //3.we heal ones we have less than 100 health and if we want to heal for more than 100 than we from the health into 100
                case "potion" -> {
                    int hpBefore = health;
                    health = Math.min(health + Integer.parseInt(command[1]), 100);
                    System.out.printf("You healed for %d hp.%n", health - hpBefore);
                    System.out.printf("Current health: %d hp.%n", health);
                }
                //4.just a simple collection preformance of bitcoins nothing too complicated
                case "chest" -> {
                    int bitcoinsFound = Integer.parseInt(command[1]);
                    bitcoins += bitcoinsFound;
                    System.out.printf("You found %d bitcoins.%n", bitcoinsFound);
                }
                //5.we implement the boss fighting ability by checking if the player is defeated or not
                default -> {
                    health -= Integer.parseInt(command[1]);
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command[0]);
                    } else {
                        //6.but if we lose to the boss we print the final results and then stop the program without going out of the loop
                        System.out.printf("You died! Killed by %s.%n", command[0]);
                        System.out.printf("Best room: %d", i + 1);
                        return;
                    }
                }
            }
        }
        //7.but if we survive than we print our stats that are left
        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", bitcoins, health);
    }
}
