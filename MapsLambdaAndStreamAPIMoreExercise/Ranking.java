package MapsLambdaAndStreamAPIMoreExercise;

import com.sun.source.tree.Tree;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ще ползваме начален стринг за да може да правим проверки с лаил цикъла
        String input = sc.nextLine();

        HashMap<String, String> contestInfo = new HashMap<>();
        while (!input.equals("end of contests")) {
            String[] command = input.split(":");

            //Добавя ме си информацията която ни е дадена от конзолата
            contestInfo.put(command[0], command[1]);

            input = sc.nextLine();
        }

        //Пак ще ползваме начален стринг за същата причина
        String input1 = sc.nextLine();

        TreeMap<String, List<String>> aUserAndHisContests = new TreeMap<>();
        TreeMap<String, List<Integer>> aUserAndHisPoints = new TreeMap<>();
        while (!input1.equals("end of submissions")) {
            String[] command = input1.split("=>");

            //проверяваме дали паролата и контеста е валиден
            if (contestInfo.containsKey(command[0])) {
                if (command[1].equals(contestInfo.get(command[0]))) {
                    //проверяваме дали вече в мапа ни има еднакъв юзър или контест и ако има добавяме ъпдеитнат сет с повечето точки
                    if (aUserAndHisContests.containsKey(command[2]) && aUserAndHisContests.get(command[2]).contains(command[0])) {
                        int index = aUserAndHisContests.get(command[2]).indexOf(command[0]);
                        int currentPoints = aUserAndHisPoints.get(command[2]).get(index);
                        aUserAndHisPoints.get(command[2]).set(index, Math.max(currentPoints, Integer.parseInt(command[3])));
                    } else {
                        aUserAndHisContests.putIfAbsent(command[2], new ArrayList<>());
                        aUserAndHisContests.get(command[2]).add(command[0]);
                        aUserAndHisPoints.putIfAbsent(command[2], new ArrayList<>());
                        aUserAndHisPoints.get(command[2]).add(Integer.parseInt(command[3]));
                    }
                }
            }

            input1 = sc.nextLine();
        }

        String best = "";
        int sum = 0;
        int max = Integer.MIN_VALUE;
        //Тука търся юзъра които има най-много точки и след този цикъл го принтирам на конзолата
        for (Map.Entry<String, List<Integer>> stringListEntry : aUserAndHisPoints.entrySet()) {
            String currentUser = stringListEntry.getKey();
            for (Integer integer : stringListEntry.getValue()) {
                sum += integer;
            }

            if (max < sum) {
                max = sum;
                best = currentUser;
            }
            sum = 0;
        }

        System.out.printf("Best candidate is %s with total %d points.%n", best, max);
        System.out.println("Ranking: ");
        //След като сме готови с това ще вземем всички сорсове с които съхранявахме данни в 2-рия лаил цикъл
        //и принтираме данните сортирани по най-много точки ама преди това принтираме юзъра на които приднадлежат тези данни
        TreeMap<Integer, String> pointsAndContests = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, List<Integer>> stringListEntry : aUserAndHisPoints.entrySet()) {
            System.out.println(stringListEntry.getKey());
            for (int i = 0; i < stringListEntry.getValue().size(); i++) {
                pointsAndContests.put(stringListEntry.getValue().get(i), aUserAndHisContests.get(stringListEntry.getKey()).get(i));
            }
            pointsAndContests.forEach((k, v) -> System.out.println("#  " + v + " -> " + k));
            pointsAndContests.clear();
        }
    }
}
