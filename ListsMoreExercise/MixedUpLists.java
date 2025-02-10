package ListsMoreExercise;

import java.util.*;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toList();
        List<Integer> numbers1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toList();

        int n = Math.max(numbers.size(), numbers1.size());

        List<Integer> numbers2 = new ArrayList<>();
        List<Integer> theRest = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i >= numbers.size()) {
                theRest.add(numbers1.get((numbers1.size() - 1) - i));
            } else if (i >= numbers1.size()) {
                theRest.add(numbers.get(i));
            } else {
                numbers2.add(numbers.get(i));
                numbers2.add(numbers1.get((numbers1.size() - 1) - i));
            }
        }

        int biggest;
        int lowest;
        if (theRest.getFirst() > theRest.get(1)) {
            biggest = theRest.getFirst();
            lowest = theRest.get(1);
        } else {
            lowest = theRest.getFirst();
            biggest = theRest.get(1);
        }
        List<Integer> finalList = new ArrayList<>();
        for (Integer integer : numbers2) {
            if (integer > lowest && integer < biggest) {
                finalList.add(integer);
            }
        }

        Collections.sort(finalList);
        finalList.forEach(f -> System.out.print(f + " "));
    }
}
