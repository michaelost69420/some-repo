package ProgrammingFundamentalsFinalExamRetake2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        Pattern pattern = Pattern.compile("([#@])(?<Word1>[A-Za-z]{3,})\\1{2}(?<Word2>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(txt);

        List<String> mirrorWords = new ArrayList<>();


        int count = 0;
        while (matcher.find()) {
            count++;
            String word1 = matcher.group("Word1");
            String word2 = matcher.group("Word2");

            StringBuilder stringBuilder = new StringBuilder(word1);
            stringBuilder.reverse();

            if (stringBuilder.toString().equals(word2)) {
                mirrorWords.add(word1 + " <=> " + word2);
            }
        }

        if (count == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", count);
        }

        if (mirrorWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));
        }

    }
}
