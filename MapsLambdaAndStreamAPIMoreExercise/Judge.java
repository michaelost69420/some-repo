package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        TreeMap<String , Integer> aUserAndHisTotalPoints = new TreeMap<>();
        LinkedHashMap<String, TreeMap<String, Integer>> theContestUserAndHisPoints = new LinkedHashMap<>();
        while (!input.equals("no more time")) {
            String[] command = input.split(" -> ");

            boolean test1 = theContestUserAndHisPoints.containsKey(command[1]) && theContestUserAndHisPoints.get(command[1]).containsKey(command[0]);
            boolean test2 = aUserAndHisTotalPoints.containsKey(command[0]);
            if (!(test1) && test2) {
                int currentPoints = aUserAndHisTotalPoints.get(command[0]);
                aUserAndHisTotalPoints.put(command[0], currentPoints + Integer.parseInt(command[2]));
            } else {
                aUserAndHisTotalPoints.merge(command[0], Integer.parseInt(command[2]), Math::max);
            }

            theContestUserAndHisPoints.putIfAbsent(command[1], new TreeMap<>());
            theContestUserAndHisPoints.get(command[1]).merge(command[0], Integer.parseInt(command[2]), Math::max);

            input = sc.nextLine();
        }

        for (Map.Entry<String, TreeMap<String, Integer>> entry : theContestUserAndHisPoints.entrySet()) {
            String contestName = entry.getKey();
            TreeMap<String, Integer> scores = entry.getValue();

            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(scores.entrySet());
            sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            System.out.println(contestName + ": " + sortedList.size() + " participants");

            int count = 1;
            for (Map.Entry<String, Integer> stringIntegerEntry : sortedList) {
                System.out.println(count + ". " + stringIntegerEntry.getKey() + " <::> " + stringIntegerEntry.getValue());
                count++;
            }
        }

        LinkedHashMap<String, Integer> sortedMap = aUserAndHisTotalPoints.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        System.out.println("Individual standings:");

        int count1 = 1;
        for (Map.Entry<String, Integer> stringIntegerEntry : sortedMap.entrySet()) {
            System.out.println(count1 + ". " + stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
            count1++;
        }

    }
}
