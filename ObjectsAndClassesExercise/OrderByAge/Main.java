package ObjectsAndClassesExercise.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Information> informations = new ArrayList<>();
        while (!input.equals("End")) {
            String[] command = input.split(" ");

            informations.add(new Information(command[0], command[1], Integer.parseInt(command[2])));

            input = sc.nextLine();
        }

        informations.sort(Comparator.comparing(Information::getAge));

        for (Information information : informations) {
            System.out.println(information);
        }
    }
}
