package LabBitwiseOperations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> differentNumbers = new LinkedHashSet<>();

        Arrays.stream(numbers).forEach(differentNumbers::add);

        int[] count = new int[differentNumbers.size()];
        int count1 = 0;
        int count2 = 0;
        for (Integer differentNumber : differentNumbers) {
            for (int number : numbers) {
                if (number == differentNumber) {
                    count1++;
                }
            }
            count[count2] = count1;
            count2++;
            count1 = 0;
        }

        List<Integer> list = new ArrayList<>(differentNumbers);

        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
