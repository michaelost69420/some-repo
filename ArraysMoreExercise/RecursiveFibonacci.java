package ArraysMoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int n2 = 1;
        int n1 = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i >= 2) {
                sum = n1 + n2;

                n2 = n1;
                n1 = sum;
            } else {
                sum = 1;
            }
        }

        System.out.println(sum);
    }
}
