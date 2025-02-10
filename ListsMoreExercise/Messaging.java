package ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        String text = sc.nextLine();


        StringBuilder updatedString = new StringBuilder();
        updatedString.append(text);
        LinkedList<Character> result = new LinkedList<>();
        for (String s : numbers) {
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                char number = s.charAt(j);
                sum += Integer.parseInt(String.valueOf(number));
            }
            if (sum > text.length()) {
                int index = sum % text.length();
                result.add(updatedString.charAt(index));
                updatedString.deleteCharAt(index);
            } else if (sum == text.length()) {
                result.add(updatedString.charAt(0));
                updatedString.deleteCharAt(0);
            } else {
                result.add(updatedString.charAt(sum));
                updatedString.deleteCharAt(sum);
            }
        }

        result.forEach(System.out::print);
    }
}
