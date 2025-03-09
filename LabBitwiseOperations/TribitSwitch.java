package LabBitwiseOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TribitSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        List<Integer> bits = new ArrayList<>();
        do {
            int last = number % 2;
            bits.add(last);
            number /= 2;
        } while (number != 0);

        Collections.reverse(bits);

        List<Integer> list = bits.subList(((bits.size() - 1) - n) - 2, ((bits.size() - 1) - n) + 2);


        String bits1 = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));

        int currentNumber = Integer.parseInt(bits1, 2);

        int result = currentNumber << 2;

        String currentBits = Integer.toBinaryString(result);

        String threeBitsSubString = currentBits.substring(0, 3);

        int count = 0;
        for (int i = 0; i < bits.size(); i++) {
            if (i >= ((bits.size() - 1) - n) - 2 && i <= ((bits.size() - 1) - n) + 1 && count < 3) {
                bits.set(i, Integer.parseInt(String.valueOf(threeBitsSubString.charAt(count))));
                count++;
            }
        }

        String finalString = bits.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));

        System.out.println(Integer.parseInt(finalString, 2));

    }
}
