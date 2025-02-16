package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");

            switch (command[0]) {
                case "Include" -> numbers.add(command[1]);
                case "Remove" -> {
                    if (Integer.parseInt(command[2]) <= numbers.size()) {
                        switch (command[1]) {
                            case "last" -> {
                                for (int j = numbers.size() - 1; j >= numbers.size() - Integer.parseInt(command[2]); j--) {
                                    numbers.set(j, "_");
                                }
                            }
                            case "first" -> {
                                for (int j = 0; j < Integer.parseInt(command[2]); j++) {
                                    numbers.set(j, "_");
                                }
                            }
                        }
                        numbers.removeAll(List.of("_"));
                    }
                }
                case "Prefer" -> {
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    if ((index1 >= 0 && index1 < numbers.size()) && (index2 >= 0 && index2 < numbers.size())) {
                        String number = numbers.get(index1);
                        numbers.set(index1, numbers.get(index2));
                        numbers.set(index2, number);
                    }
                }
                case "Reverse" -> Collections.reverse(numbers);
            }
        }
        System.out.println("Coffees:\n" + String.join(" ", numbers));
    }
}
