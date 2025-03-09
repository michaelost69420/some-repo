package TextProcessingMoreExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> morseTranslate = new HashMap<>();

        morseTranslate.put(".-", "A");
        morseTranslate.put("-...", "B");
        morseTranslate.put("-.-.", "C");
        morseTranslate.put("-..", "D");
        morseTranslate.put(".", "E");
        morseTranslate.put("..-.", "F");
        morseTranslate.put("--.", "G");
        morseTranslate.put("....", "H");
        morseTranslate.put("..", "I");
        morseTranslate.put(".---", "J");
        morseTranslate.put("-.-", "K");
        morseTranslate.put(".-..", "L");
        morseTranslate.put("--", "M");
        morseTranslate.put("-.", "N");
        morseTranslate.put("---", "O");
        morseTranslate.put(".--.", "P");
        morseTranslate.put("--.-", "Q");
        morseTranslate.put(".-.", "R");
        morseTranslate.put("...", "S");
        morseTranslate.put("-", "T");
        morseTranslate.put("..-", "U");
        morseTranslate.put("...-", "V");
        morseTranslate.put(".--", "W");
        morseTranslate.put("-..-", "X");
        morseTranslate.put("-.--", "Y");
        morseTranslate.put("--..", "Z");

        String[] sequenceOfMorseCode = sc.nextLine().split(" ");

        for (String string : sequenceOfMorseCode) {
            if (string.equals("|")) {
                System.out.print(" ");
            } else {
                System.out.print(morseTranslate.get(string));
            }
        }
    }
}
