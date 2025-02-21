package ObjectsAndClassesLab.RandomizeWords;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());

        List<Integer> indexes = new ArrayList<>();

        Random2ndVersion(indexes, numbers.size());

       List<String> numbersCopy = new ArrayList<>(numbers);
       for (int i = 0; i < numbers.size(); i++) {
            numbers.set(indexes.get(i), numbersCopy.get(i));
        }

       numbers.forEach(System.out::println);
    }

    public static void Random2ndVersion (List<Integer> indexes, int size) {
        Random random = new Random();
        if (size != 1) {
            for (int i = 0; i < size; i++) {
                int index = random.nextInt(size - 1);
                if (indexes.contains(index)) {
                    for (int j = 0; j < size; j++) {
                        if (!indexes.contains(j)) {
                            indexes.add(j);
                            break;
                        }
                    }
                } else {
                    indexes.add(index);
                }
            }
        } else {
            indexes.add(0);
        }
    }
}
