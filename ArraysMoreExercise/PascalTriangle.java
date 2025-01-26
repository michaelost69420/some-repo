package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int count = 0;
        int[] number = new int[n];
        int[] number1 = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    number[j - 1] = 1;
                    break;
                } else {
                    if (j == 1 || j == i) {
                        number[j - 1] = 1;
                    } else {
                        if (count == 0) {
                            number[j - 1] = 2;
                        } else {
                            number[j - 1] = number1[j - 2] + number1[j - 1];
                        }
                        count++;
                    }
                }
            }
            Arrays.stream(number).filter(num -> num != 0).forEach(number2 -> System.out.print(number2 + " "));

            System.out.println();

            System.arraycopy(number, 0, number1, 0, n);
            Arrays.fill(number, 0);
        }
    }
}
