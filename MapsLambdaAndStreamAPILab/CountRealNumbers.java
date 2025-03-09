package MapsLambdaAndStreamAPILab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(sc.nextLine()
                        .split(" "))
                .map(Double::parseDouble).sorted().toList();

        Map<Double, Integer> number = new TreeMap<>();
        double currentValue = numbers.getFirst();
        int count = 0;
        for (Double v : numbers) {
            count++;

            if (currentValue != v) {
                count = 1;
                number.put(v, count);
            } else {
                number.put(v, count);
            }

            currentValue = v;
        }

        for (Map.Entry<Double, Integer> number1 : number.entrySet()) {
            System.out.printf("%.0f -> %d%n", number1.getKey(), number1.getValue());
        }
    }
}
