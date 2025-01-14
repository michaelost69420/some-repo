package BasicSyntaxConditionalStatementsandLoopsMoreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());

        double maxMoney = money;
        double price = 0;
        String input;
        while (!(input = sc.nextLine()).equals("Game Time")) {

            switch (input) {
                case "OutFall 4", "RoverWatch Origins Edition" -> price = 39.99;
                case "CS: OG" -> price = 15.99;
                case "Zplinter Zell" -> price = 19.99;
                case "Honored 2" -> price = 59.99;
                case "RoverWatch" -> price = 29.99;
                default -> {
                    System.out.println("Not found");
                    continue;
                }
            }

            if (money >= price) {
                System.out.println("Bought " + input);
                money -= price;
            } else {
                System.out.println("Too Expensive");
            }
            if (money == 0) {
                System.out.println("Out of money!");
                return;
            }
        }
        double moreMoney = maxMoney - money;
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moreMoney, maxMoney - moreMoney);
    }
}
