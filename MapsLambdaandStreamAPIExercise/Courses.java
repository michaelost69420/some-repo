package MapsLambdaandStreamAPIExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Първо трябва да добавя начален инпут на конзолата
        String input = sc.nextLine();

        LinkedHashMap<String, List<String>> courseInfo = new LinkedHashMap<>();
        //Правя лаил цикъл и с него взимам данни от конзолата докато на получа "end"
        while (!input.equals("end")) {
            String[] command = input.split(" : ");

            //Добавям нов ентриСет в мапа само ако клуча ми е различен ако е еднакъв тогава към него просто добавям елемента към листа
            courseInfo.putIfAbsent(command[0], new ArrayList<>());
            courseInfo.get(command[0]).add(command[1]);


            input = sc.nextLine();
        }

        //Накрая принтираме важната информация на консолата
        for (Map.Entry<String, List<String>> stringListEntry : courseInfo.entrySet()) {
            System.out.println(stringListEntry.getKey() + ": " + stringListEntry.getValue().size());
            stringListEntry.getValue().forEach(v -> System.out.println("-- " + v));
        }
    }
}
