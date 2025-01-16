package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        int StoredI;
        for (int i = 1; i <= n; i++) {
            StoredI = i;

            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            if ((sum == 5) || (sum == 7) || (sum == 11)) {
                System.out.printf("%d -> True%n", StoredI);
            } else {
                System.out.printf("%d -> False%n", StoredI);
            }

            sum = 0;
            i = StoredI;
        }
    }
}
