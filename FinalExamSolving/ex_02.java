package FinalExamSolving;

import java.util.Scanner;
import java.util.regex.*;

public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Pattern pattern = Pattern.compile("((.)(\\2)*)\\>(?<number>\\d{3})\\|(?<letters>[a-z]{3})\\|(?<LETTERS>[A-Z]{3})\\|(?<symbols>[^<>]{3})\\<\\1");

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String number = matcher.group("number");
                String letters = matcher.group("letters");
                String LETTERS = matcher.group("LETTERS");
                String symbols = matcher.group("symbols");

                System.out.printf("Password: %s%s%s%s%n", number, letters, LETTERS, symbols);
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
