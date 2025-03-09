package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Snowwhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        TreeMap<String, LinkedHashMap<String, Integer>> HatColorNameAndPhysic = new TreeMap<>();
        while (!input.equals("Once upon a time")) {
            String[] command = input.split(" <:> ");

            HatColorNameAndPhysic.putIfAbsent(command[1], new LinkedHashMap<>());
            HatColorNameAndPhysic.get(command[1]).merge(command[0], Integer.parseInt(command[2]), Math::max);

            input = sc.nextLine();
        }

        List<Map.Entry<String, LinkedHashMap<String, Integer>>> sortedList = new ArrayList<>(HatColorNameAndPhysic.entrySet());

        sortedList.sort((e1, e2) -> {
            int firstValue1 = e1.getValue().firstEntry().getValue();
            int firstValue2 = e2.getValue().firstEntry().getValue();
            return Integer.compare(firstValue2, firstValue1);
        });

        sortedList.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        for (Map.Entry<String, LinkedHashMap<String, Integer>> stringTreeMapEntry : sortedList) {
            for (Map.Entry<String, Integer> stringIntegerEntry : stringTreeMapEntry.getValue().entrySet()) {
                System.out.println("(" + stringTreeMapEntry.getKey() + ") " + stringIntegerEntry.getKey() + " <-> " + stringIntegerEntry.getValue());
            }
        }

    }
}
