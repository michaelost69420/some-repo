package ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double savings = Double.parseDouble(sc.nextLine());

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers1 = new ArrayList<>(numbers);

        String input;
        while (!(input = sc.nextLine()).equals("Hit it again, Gabsy!")) {
            int decreasing = Integer.parseInt(input);
            for (int i = 0; i < numbers.size(); i++) {
                    numbers.set(i, numbers.get(i) - decreasing);
                    if (numbers.get(i) <= 0) {
                        if (savings >= numbers1.get(i) * 3) {
                            savings -= numbers1.get(i) * 3;
                            numbers.set(i, numbers1.get(i));
                        } else {
                            numbers.set(i, -1);
                            numbers1.set(i, -1);
                        }
                    }
            }
            numbers.removeAll(List.of(-1));
            numbers1.removeAll(List.of(-1));
        }
        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
