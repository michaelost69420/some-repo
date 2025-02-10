package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double size = numbers.size() / 2.0;
        int finalSize = (int) Math.ceil(size);
        for (int i = 0; i < finalSize; i++) {
            if (numbers.size() % 2 != 0 && i == (numbers.size() - 1) / 2) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + numbers.get(((numbers.size() - 1) - i)) + " ");
            }
        }
    }
}
