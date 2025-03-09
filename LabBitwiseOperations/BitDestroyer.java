package LabBitwiseOperations;

import java.util.*;

public class BitDestroyer {
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

        bits.set(n, 0);

        Collections.reverse(bits);

        int count1 = 1;
        int sum = 0;

        for (int i = 0; i < bits.size(); i++) {
            sum += (int) (bits.get(i) * Math.pow(2, bits.size() - count1));
            count1++;
        }

        System.out.println(sum);
    }
}
