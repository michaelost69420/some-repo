package LabBitwiseOperations;

import java.util.Scanner;

public class BitAtPosition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        String binaryNumber = "";
        do {
            int last = number % 2;
            binaryNumber += last;
            number /= 2;
        } while (number != 0);

        String stringBuilder = new StringBuilder(binaryNumber).reverse().toString();

        System.out.println(stringBuilder.charAt(stringBuilder.length() - 2));
    }
}
