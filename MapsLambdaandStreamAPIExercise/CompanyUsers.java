package MapsLambdaandStreamAPIExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //За начало ще ползваме начален инпут от конзолата
        String input = sc.nextLine();

        LinkedHashMap<String, List<String>> companyEmployment = new LinkedHashMap<>();
        //С лаил цикъла ще взимаме данни от конзолата докато не получим нужната команда за спирането на цикъла
        while (!input.equals("End")) {
            String[] command = input.split(" -> ");

            companyEmployment.putIfAbsent(command[0], new ArrayList<>());
            //Тука проверявам дали имам такъв елемент в листа ми и ако няма ще го добавя
            if (!companyEmployment.get(command[0]).contains(command[1])) {
                companyEmployment.get(command[0]).add(command[1]);
            }

            input = sc.nextLine();
        }

        for (Map.Entry<String, List<String>> stringListEntry : companyEmployment.entrySet()) {
            System.out.println(stringListEntry.getKey());
            stringListEntry.getValue().forEach(v -> System.out.println("-- " + v));
        }
    }
}
