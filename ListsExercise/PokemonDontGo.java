package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (!numbers.isEmpty()) {
            int n = Integer.parseInt(sc.nextLine());

            //1.checking if the index is out of bounds or not and stored the value we do or are suppost to remove in a container
            //also we add sum for each time we store a value in the container
            int container;
            if (n >= 0 && n <= numbers.size() - 1) {
                container = numbers.get(n);
                numbers.remove(n);
            } else {
                if (n < 0) {
                    container = numbers.getFirst();
                    numbers.removeFirst();
                    numbers.addFirst(numbers.getLast());
                } else {
                    container = numbers.getLast();
                    numbers.removeLast();
                    numbers.addLast(numbers.getFirst());
                }
            }
            sum += container;
            //2.loop through each element to compare them to the value inside
            //if number at index i <= container -> number at index i += container;
            //else -> number at index i = container - number at index i
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) <= container) {
                    numbers.set(i, numbers.get(i) + container);
                } else {
                    numbers.set(i, numbers.get(i) - container);
                }
            }
        }

        System.out.println(sum);
    }
}