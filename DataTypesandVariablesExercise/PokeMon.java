package DataTypesandVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());

        int poked = 0;
        int nsOriginalValue = n;
        while (n >= m) {

            if (n == nsOriginalValue / 2) {
                if (y != 0) {
                    n /= y;
                }
            }

            if (m < n) {
                n -= m;
                poked++;
            }

        }

        System.out.printf("%d%n%d", n, poked);

    }
}
