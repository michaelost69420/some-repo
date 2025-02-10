package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(n -> n < 0);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int i = numbers.size() - 1; i >= 0; i--) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
