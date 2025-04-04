package ProgrammingFundamentalsFinalExamRetake1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class AdAstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Pattern pattern = Pattern.compile("([\\|#])(?<Item>[A-Za-z ]+)\\1(?<Date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<Nutritions>\\d+)\\1");
        Matcher matcher = pattern.matcher(str);

        int totalCal = 0;
        List<String> items = new ArrayList<>();
        List<String> dates = new ArrayList<>();
        List<Integer> calories = new ArrayList<>();
        while (matcher.find()) {
            totalCal += Integer.parseInt(matcher.group("Nutritions"));
            items.add(matcher.group("Item"));
            dates.add(matcher.group("Date"));
            calories.add(Integer.parseInt(matcher.group("Nutritions")));
        }
        System.out.printf("You have food to last you for: %d days!%n", totalCal / 2000);

        for (int i = 0; i < items.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", items.get(i), dates.get(i), calories.get(i));
        }

    }
}
