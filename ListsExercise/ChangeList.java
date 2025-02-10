package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Delete")) {
                numbers.removeAll(List.of(Integer.parseInt(command[1])));
            } else if (command[0].equals("Insert")) {
                numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            input = sc.nextLine();
        }

        numbers.forEach(n -> System.out.print(n + " "));
    }
}
