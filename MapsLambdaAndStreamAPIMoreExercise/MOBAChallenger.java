package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;

public class MOBAChallenger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        TreeMap<String, Map<String, Integer>> aUserAndHisPositionAndSkill = new TreeMap<>();
        TreeMap<String, Integer> aUserAndTotalSkill = new TreeMap<>();
        while (!input.equals("Season end")) {
            if (input.contains("->")) {
                String[] command = input.split(" -> ");

                boolean test1 = aUserAndHisPositionAndSkill.containsKey(command[0]) && aUserAndHisPositionAndSkill.get(command[0]).containsKey(command[1]);
                boolean test2 = aUserAndTotalSkill.containsKey(command[0]);
                if (!(test1) && test2) {
                    int currentPoints = aUserAndTotalSkill.get(command[0]);
                    aUserAndTotalSkill.put(command[0], currentPoints + Integer.parseInt(command[2]));
                } else {
                    aUserAndTotalSkill.merge(command[0], Integer.parseInt(command[2]), Math::max);
                }

                aUserAndHisPositionAndSkill.putIfAbsent(command[0], new HashMap<>());
                aUserAndHisPositionAndSkill.get(command[0]).merge(command[1], Integer.parseInt(command[2]), Math::max);
            } else {
                String[] command = input.split(" vs ");

                if (aUserAndHisPositionAndSkill.containsKey(command[0]) && aUserAndHisPositionAndSkill.containsKey(command[1])) {
                    boolean containsDuplicatePositions = false;
                    for (Map.Entry<String, Integer> stringIntegerEntry : aUserAndHisPositionAndSkill.get(command[0]).entrySet()) {
                        for (Map.Entry<String, Integer> integerEntry : aUserAndHisPositionAndSkill.get(command[1]).entrySet()) {
                            if (stringIntegerEntry.getKey().equals(integerEntry.getKey())) {
                                containsDuplicatePositions = true;
                                break;
                            }
                        }
                    }

                    if (containsDuplicatePositions) {
                        int firstSum = 0;
                        for (Map.Entry<String, Integer> stringIntegerEntry : aUserAndHisPositionAndSkill.get(command[0]).entrySet()) {
                            firstSum += stringIntegerEntry.getValue();
                        }

                        int secondSum = 0;
                        for (Map.Entry<String, Integer> stringIntegerEntry : aUserAndHisPositionAndSkill.get(command[1]).entrySet()) {
                            secondSum += stringIntegerEntry.getValue();
                        }

                        if (secondSum > firstSum) {
                            aUserAndHisPositionAndSkill.remove(command[0]);
                            aUserAndTotalSkill.remove(command[0]);
                        } else if (secondSum < firstSum) {
                            aUserAndHisPositionAndSkill.remove(command[1]);
                            aUserAndTotalSkill.remove(command[1]);
                        }
                    }
                }
            }
            input = sc.nextLine();
        }

        Map<String, Integer> sortedMap = aUserAndTotalSkill.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(LinkedHashMap::new, (m, v) -> m.put(v.getKey(), v.getValue()), Map::putAll);

        Map<String, Integer> helperMap = new TreeMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : sortedMap.entrySet()) {
            helperMap.putAll(aUserAndHisPositionAndSkill.get(stringIntegerEntry.getKey()));
            Map<String, Integer> sortedMap1 = helperMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(LinkedHashMap::new, (m, v) -> m.put(v.getKey(), v.getValue()), Map::putAll);
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue() + " skill");
            for (Map.Entry<String, Integer> integerEntry : sortedMap1.entrySet()) {
                System.out.println("- " + integerEntry.getKey() + " <::> " + integerEntry.getValue());
            }
            sortedMap1.clear();
            helperMap.clear();
        }
    }
}
