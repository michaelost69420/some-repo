package LabBitwiseOperations;

import java.util.*;

public class PthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());

        String binaryNumber = "";
        List<Integer> bits = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        do {
            int last = number % 2;
            binaryNumber += last;
            number /= 2;
        } while (number != 0);

        String reversed = new StringBuilder(binaryNumber).reverse().toString();

        int length = 15 - (reversed.length() - 1);

        int count = 0;
        for (int i = length; i < bits.size(); i++) {
            bits.set(i, Integer.parseInt(String.valueOf(reversed.charAt(count))));
            count++;
        }

        System.out.println(bits.get((bits.size() - 1) - p));
    }
}
