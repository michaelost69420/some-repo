package MapsLambdaandStreamAPIExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Добавяме броиката пъти в които ще взимаме от конзолата информация за определени ученици
        int n = Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, List<Double>> studentsGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            //В фор цикъла взимаме ученик и оценката му от конзолата като казваме че ако ученика съществува в мапа просто
            //ще го добавим към листа ако го нямаме го добавяме в мапа
            String student = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());
            studentsGrades.putIfAbsent(student, new ArrayList<>());
            studentsGrades.get(student).add(grade);
        }

        //Накрая принтираме резултата като намираме средно аретметично на всеки един ученик
        for (Map.Entry<String, List<Double>> stringListEntry : studentsGrades.entrySet()) {
            double avr = stringListEntry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            if (avr >= 4.5) {
                System.out.printf("%s -> %.2f%n", stringListEntry.getKey(), avr);
            }
        }
    }
}
