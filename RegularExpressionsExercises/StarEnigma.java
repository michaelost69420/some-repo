package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.*;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Pattern pattern = Pattern.compile("\\@[A-za-z]+");
        Pattern pattern1 = Pattern.compile("\\:\\d+");
        Pattern pattern2 = Pattern.compile("\\![AD]\\!");
        Pattern pattern3 = Pattern.compile("->\\d+");

        int count = 0;
        StringBuilder strBuilder = new StringBuilder();

        Map<String, List<String>> typeOfAttackAndThePlanet = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String encryptedMessage = sc.nextLine();

            for (char character : encryptedMessage.toCharArray()) {
                if (character == 's' || character == 't' || character == 'a' || character == 'r' || character == 'S' || character == 'T' || character == 'A' || character == 'R') {
                    count++;
                }
            }

            for (int j = 0; j < encryptedMessage.length(); j++) {
                char character = (char) (encryptedMessage.charAt(j) - count);
                strBuilder.append(character);
            }

            Matcher matcher = pattern.matcher(strBuilder);
            Matcher matcher1 = pattern1.matcher(strBuilder);
            Matcher matcher2 = pattern2.matcher(strBuilder);
            Matcher matcher3 = pattern3.matcher(strBuilder);

            if (matcher.find() && matcher1.find() && matcher2.find() && matcher3.find()) {
                String name = matcher.group().replace("@", "");
                String type = matcher2.group().replace("!", "");

                typeOfAttackAndThePlanet.putIfAbsent(type, new ArrayList<>());
                typeOfAttackAndThePlanet.get(type).add(name);
            }

            count = 0;
            strBuilder.setLength(0);
        }

        typeOfAttackAndThePlanet.forEach((k, v) -> Collections.sort(v));

        int length = (typeOfAttackAndThePlanet.get("A") == null) ? 0 : typeOfAttackAndThePlanet.get("A").size();
        System.out.printf("Attacked planets: %d%n", length);
        for (int i = 0; i < length; i++) {
            System.out.printf("-> %s%n", typeOfAttackAndThePlanet.get("A").get(i));
        }
        int length1 = (typeOfAttackAndThePlanet.get("D") == null) ? 0 : typeOfAttackAndThePlanet.get("D").size();
        System.out.printf("Destroyed planets: %d%n", length1);
        for (int i = 0; i < length1; i++) {
            System.out.printf("-> %s%n", typeOfAttackAndThePlanet.get("D").get(i));
        }
    }
}
