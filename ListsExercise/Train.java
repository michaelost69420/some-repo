package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int max = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                numbers.add(Integer.parseInt(command[1]));
            } else {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) + Integer.parseInt(command[0]) <= max) {
                        numbers.set(i, numbers.get(i) + Integer.parseInt(command[0]));
                        break;
                    }
                }
            }

            input = sc.nextLine();
        }

        numbers.forEach(n -> System.out.print(n + " "));
    }
}
