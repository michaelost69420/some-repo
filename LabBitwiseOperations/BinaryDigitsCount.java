package LabBitwiseOperations;

import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        int count = 0;
        do {
            if (number % 2 == n) {
                count++;
            }
            number /= 2;
        } while (number != 0);


        System.out.println(count);
    }
}
