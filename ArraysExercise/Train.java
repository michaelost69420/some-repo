package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();

        System.out.println(sum);
    }
}
