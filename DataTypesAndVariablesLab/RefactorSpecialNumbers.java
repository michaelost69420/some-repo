package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int something;
        for (int i = 1; i <= amount; i++) {

            something = i;
            while (i > 0) {

                sum += i % 10;
                i = i / 10;

            }
            boolean toe = (sum == 5) || (sum == 7) || (sum == 11);

            if (toe) {
                System.out.printf("%d -> True%n", something);
            } else {
                System.out.printf("%d -> False%n", something);
            }

            sum = 0;
            i = something;
        }

    }
}
