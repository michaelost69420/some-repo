package ProgrammingFundamentalsFinalExam2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        BigInteger bigInteger = new BigInteger("1");
        for (char character : txt.toCharArray()) {
            if (Character.isDigit(character)) {
                bigInteger = bigInteger.multiply(BigInteger.valueOf(Character.getNumericValue(character)));
            }
        }

        Pattern pattern = Pattern.compile("(::|\\*\\*)[A-Z][a-z]{2,}\\1");
        Matcher matcher = pattern.matcher(txt);


        List<String> coolEmojis = new ArrayList<>();
        while (matcher.find()) {
            String emojy = matcher.group();

            int sum1 = 0;
            for (int i = 2; i <= emojy.length() - 2; i++) {
                sum1 += emojy.charAt(i);
            }

            if (sum1 >= Integer.parseInt(String.valueOf(bigInteger))) {
                coolEmojis.add(emojy);
            }
        }

        System.out.printf("Cool threshold: %d%n", Integer.parseInt(String.valueOf(bigInteger)));
        System.out.printf("%d emojis found in the text. The cool ones are:%n", (int) pattern.matcher(txt).results().count());
        coolEmojis.forEach(System.out::println);

    }
}
