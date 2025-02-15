package MidExamPreparation_05;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we put all the elements separated by "|"
        List<String> numbers = Arrays.stream(sc.nextLine().split("\\|")).collect(Collectors.toList());

        //2.we loop util we don't receive "Yohoho!"
        String input = sc.nextLine();
        while (!input.equals("Yohoho!")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Loot" -> {
                    int count = 0;
                    for (int i = command.length - 1; i > 0; i--) {
                        if (!numbers.contains(command[i])) {
                            numbers.add(count, command[i]);
                            count++;
                        }
                    }
                }
                case "Drop" -> {
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < numbers.size()) {
                        String item = numbers.get(Integer.parseInt(command[1]));
                        numbers.remove(item);
                        numbers.add(item);
                    }
                }
                case "Steal" -> {
                    List<String> result2 = new ArrayList<>();
                    String result = "";
                    if (Integer.parseInt(command[1]) < numbers.size()) {
                        for (int i = (numbers.size() - 1) - (Integer.parseInt(command[1]) - 1); i < numbers.size(); i++) {
                            result2.add(numbers.get(i));
                            if (i != numbers.size() - 1) {
                                result += numbers.get(i) + ", ";
                            } else {
                                result += numbers.get(i);
                            }
                        }
                        numbers.removeAll(result2);
                        System.out.println(result);
                    } else {
                        List<String> result1 = new ArrayList<>(numbers);
                        numbers.removeAll(result1);
                        System.out.println(String.join(", ", result1));
                    }
                }
            }

            input = sc.nextLine();
        }

        int sum = 0;
        for (String number : numbers) {
            sum += number.length();
        }

        double avr = (double) sum / numbers.size();

        if (!numbers.isEmpty()) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", avr);
        } else {
            System.out.print("Failed treasure hunt.");
        }
    }
}
