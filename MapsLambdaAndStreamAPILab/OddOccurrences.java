package MapsLambdaAndStreamAPILab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sequenceOfWords = sc.nextLine().split(" ");

        int count = 1;
        Map<String, Integer> sequenceChecker = new LinkedHashMap<>();
        for (int i = 0; i < sequenceOfWords.length; i++) {
            String result = sequenceOfWords[i].toLowerCase();
            for (int j = i + 1; j < sequenceOfWords.length; j++) {
                if (sequenceOfWords[j].toLowerCase().equals(result)) {
                    count++;
                }
            }
            sequenceChecker.putIfAbsent(result, count);
            count = 1;
        }

        List<String> names = new ArrayList<>();
        for (Map.Entry<String, Integer> sequence : sequenceChecker.entrySet()) {
            if (sequence.getValue() % 2 != 0) {
                names.add(sequence.getKey());
            }
        }

        System.out.println(String.join(", ", names));
    }
}
