package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int n = Math.min(numbers.size(), numbers1.size());

        for (int i = 0; i < n; i++) {
            System.out.print(numbers.get(i) + " " + numbers1.get(i) + " ");
        }

        List<Integer> rest;
        if (numbers.size() > numbers1.size()) {
            rest = numbers.subList(n, numbers.size());
        } else {
            rest = numbers1.subList(n, numbers1.size());
        }

        rest.forEach(r -> System.out.print(r + " "));
    }
}
