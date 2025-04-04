package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.*;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();

        Pattern pattern = Pattern.compile("\\W%(?<name>[A-Z][a-z]+)%<(?<product>\\w+)>[A-Za-z]*\\|(?<count>\\d+)\\|[A-Za-z]*(?<price>\\d+\\.?\\d*)\\$");

        double sum = 0;
        while (!data.equals("end of shift")) {

            Matcher matcher = pattern.matcher(data);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                sum += count * price;

                System.out.printf("%s: %s - %.2f%n", name, product, count * price);
            }

            data = sc.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);
    }
}
