package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (!(numbers.isEmpty() || numbers1.isEmpty())) {
            if (numbers.getFirst() > numbers1.getFirst()) {
                int first = numbers.getFirst();
                int second = numbers1.getFirst();
                numbers.remove(numbers.getFirst());
                numbers1.remove(numbers1.getFirst());
                numbers.add(first);
                numbers.add(second);
            } else if (numbers.getFirst() < numbers1.getFirst()) {
                int first = numbers1.getFirst();
                int second = numbers.getFirst();
                numbers.remove(numbers.getFirst());
                numbers1.remove(numbers1.getFirst());
                numbers1.add(first);
                numbers1.add(second);
            } else {
                numbers.remove(numbers.getFirst());
                numbers1.remove(numbers1.getFirst());
            }
        }

        int sum = 0;
        if (numbers.isEmpty()) {
            for(Integer number1 : numbers1) {
                sum += number1;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for(Integer number : numbers) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
