package MapsLambdaandStreamAPIExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Взимаме първоначално начален стринг за да може да правим проверки с него в лаил цикъла
        String input = sc.nextLine();

        LinkedHashMap<String, Integer> theUserAndHisPoints = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> theLanguageAndHisUsers = new LinkedHashMap<>();
        //С лаил цикъла взимаме инпут от конзолата и ко слпитваме на малки елементи в масив
        while (!input.equals("exam finished")) {
            String[] command = input.split("-");

            //проверяваме ако ученик е баннат от изпита
            if (command[1].equals("banned")) {
                theUserAndHisPoints.remove(command[0]);
            } else {

                //винаги ще добавяме юзърите които ползват опр. език в листа
                theLanguageAndHisUsers.putIfAbsent(command[1], new ArrayList<>());
                theLanguageAndHisUsers.get(command[1]).add(command[0]);

                //ако се опитаме еднаква команда на нулев индекс с вече същ име на ученик тогава от точите му в момента и тези които
                //е получил ще добавим по голямото количество
                if (theUserAndHisPoints.containsKey(command[0])) {
                    int currentPoint = theUserAndHisPoints.get(command[0]);
                    theUserAndHisPoints.put(command[0], Math.max(currentPoint, Integer.parseInt(command[2])));
                } else {
                    theUserAndHisPoints.put(command[0], Integer.parseInt(command[2]));
                }
            }

            input = sc.nextLine();
        }

        //накрая принтираме искания резултат
        System.out.println("Results:");
        theUserAndHisPoints.forEach((k, v) -> System.out.println(k + " | " + v));
        System.out.println("Submissions:");
        theLanguageAndHisUsers.forEach((k, v) -> System.out.println(k + " - " + v.size()));
    }
}
