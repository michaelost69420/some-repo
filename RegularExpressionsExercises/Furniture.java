package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.*;

public class Furniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String purchasedItem = sc.nextLine();
        Pattern pattern = Pattern.compile(">>(?<product>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)");
        System.out.println("Bought furniture:");

        double sum = 0;
        while (!purchasedItem.equals("Purchase")) {

            Matcher matcher = pattern.matcher(purchasedItem);

            if (matcher.find()) {
                String furniture = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                System.out.println(furniture);

                sum += price * quantity;
            }

            purchasedItem = sc.nextLine();
        }

        System.out.printf("Total money spend: %.2f", sum);
    }
}
