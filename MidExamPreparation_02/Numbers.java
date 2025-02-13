package MidExamPreparation_02;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we get the sequence of the numbers
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        //2.we get the sum of all the numbers
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        //2.we get the avr
        double avr = (double) sum / numbers.size();
        //3.we remove every number less or equal to the avr
        numbers.removeIf(number -> number <= avr);

        //4.we sort all numbers left from biggest
        numbers.sort(Collections.reverseOrder());

        //5.adding the subList of the numbers to a new List
        List<Integer> numbers1;
        if (numbers.size() >= 5) {
            numbers1 = numbers.subList(0, 5);
        } else {
            numbers1 = numbers.subList(0, numbers.size());
        }

        //6.we check if we have any numbers in the top 5 sequence
        if (!numbers1.isEmpty()) {
            numbers1.forEach(n -> System.out.print(n + " "));
        } else {
            System.out.println("No");
        }
    }
}
