package ArraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }
}
