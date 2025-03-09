package TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = sc.nextLine();

        StringBuilder treasureFinder = new StringBuilder(); // <- (helps us organize our next string more efficiently)
        while (!input.equals("find")) {

            int count = 0;
            for (char character : input.toCharArray()) { // toCharArray() <- will give us the char set of the string
                if (count == numbers.length) {
                    count = 0;
                }
                treasureFinder.append((char) (character - numbers[count]));
                count++;
            }

            String type = ""; // - collects all the letters for our type of treasure
            String coordinates = ""; // - collects all the letters for our coordinates of treasure
            for (int i = 0; i < treasureFinder.length(); i++) {
                if (treasureFinder.charAt(i) == '<' || treasureFinder.charAt(i) == '&') {
                    for (int j = i + 1; j < treasureFinder.length(); j++) {
                        if (treasureFinder.charAt(i) == '<' && treasureFinder.charAt(j) != '>') {
                            coordinates += treasureFinder.charAt(j);
                        } else if (treasureFinder.charAt(i) == '&' && treasureFinder.charAt(j) != '&') {
                            type += treasureFinder.charAt(j);
                        } else if (treasureFinder.charAt(i) == '<' && treasureFinder.charAt(j) == '>' || treasureFinder.charAt(i) == '&' && treasureFinder.charAt(j) == '&') {
                            i = j + 1;
                            break;
                        }
                    }
                }
            }

            System.out.printf("Found %s at %s%n", type, coordinates); // <- print out the result to the console and make a new line

            treasureFinder.setLength(0); // making sure that our stringBuilder will be empty for the next input

            input = sc.nextLine();
        }
    }
}
