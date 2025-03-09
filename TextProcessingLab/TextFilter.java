package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arraySequenceOfStrings = sc.nextLine().split(", ");
        String txt = sc.nextLine();

        for (String arraySequenceOfString : arraySequenceOfStrings) {
            String replacement = "*".repeat(arraySequenceOfString.length());
            txt = txt.replace(arraySequenceOfString, replacement);
        }

        System.out.println(txt);
    }
}
