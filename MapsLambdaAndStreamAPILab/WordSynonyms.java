package MapsLambdaAndStreamAPILab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<String>> synonymHolder = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            synonymHolder.putIfAbsent(word, new ArrayList<>());

            synonymHolder.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> synonyms : synonymHolder.entrySet()) {
            System.out.println(synonyms.getKey() + " - " + String.join(", ", synonyms.getValue()));
        }
    }
}
