package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int[] numbers1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == numbers1[0]) {
                for (int j = i - numbers1[1]; j <= i + numbers1[1]; j++) {
                    if (j >= 0 && j <= numbers.size() - 1) {
                        numbers.remove(numbers.get(j));
                        numbers.add(j, -1);
                    } else {
                        if (j < 0) {
                            numbers.remove(numbers.get(i));
                            numbers.add(i, -1);
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        numbers.removeAll(List.of(-1));
        int sum = 0;
        for(Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}

