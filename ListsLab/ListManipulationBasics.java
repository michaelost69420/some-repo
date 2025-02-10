package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Add" -> numbers.add(Integer.parseInt(command[1]));
                case "Remove" -> numbers.remove(Integer.valueOf(Integer.parseInt(command[1])));
                case "RemoveAt" -> numbers.remove(Integer.parseInt(command[1]));
                case "Insert" -> numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            input = sc.nextLine();
        }

        numbers.forEach(n -> System.out.print(n + " "));
    }
}
