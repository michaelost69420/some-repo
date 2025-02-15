package MidExamPreparation_05;

import java.util.*;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers1 = Arrays.stream(sc.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealCapacity = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();
        while (!input.equals("Retire")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Fire" -> {
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < numbers1.size()) {
                        int currentNumber = numbers1.get(index);
                        numbers1.set(index, currentNumber - Integer.parseInt(command[2]));
                        if (numbers1.get(index) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                }
                case "Defend" -> {
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    if ((index1 >= 0 && index1 <= index2 && index2 < numbers.size())) {
                        for (int i = index1; i <= index2; i++) {
                            numbers.set(i, numbers.get(i) - Integer.parseInt(command[3]));

                            if (numbers.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                }
                case "Repair" -> {
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < numbers1.size()) {
                        numbers.set(index, numbers.get(index) + Integer.parseInt(command[2]));{
                            if (numbers.get(index) > maxHealCapacity) {
                                numbers.set(index, maxHealCapacity);
                            }
                        }
                    }
                }
                case "Status" -> {
                    int count = 0;
                    for (Integer number : numbers) {
                        if (number < maxHealCapacity * 0.2) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                }
            }

            input = sc.nextLine();
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        int sum1 = 0;
        for (Integer integer : numbers1) {
            sum1 += integer;
        }
        System.out.printf("Pirate ship status: %d%nWarship status: %d", sum, sum1);
    }
}
