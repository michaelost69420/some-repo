package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.*;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strSequence = sc.nextLine().replace(" ", "").split(",");

        for (String string : strSequence) {
            int health = healthFinder(string);
            double damage = damageFinder(string);

            System.out.printf("%s - %d health, %.2f damage%n", string, health, damage);
        }
    }

    private static int healthFinder (String str) {
        int sum = 0;
        for (char character : str.toCharArray()) {
            if (Character.isLetter(character)) {
                sum += character;
            }
        }
        return sum;
    }

    private static  double damageFinder (String str) {
        Pattern pattern = Pattern.compile("[-+]?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(str);

        double sum = 0;
        while (matcher.find()) {
            sum += Double.parseDouble(matcher.group());
        }
        for (char character : str.toCharArray()) {
            if (character == '*') {
                if (sum >= 0) {
                    sum *= 2;
                } else {
                    double currentSum = Math.abs(sum);
                    currentSum *= 2;
                    sum = currentSum * -1;
                }
            } else if (character == '/') {
                if (sum >= 0) {
                    sum /= 2;
                } else {
                    double currentSum = Math.abs(sum);
                    currentSum /= 2;
                    sum = currentSum * -1;
                }
            }
        }
        return sum;
    }
}
