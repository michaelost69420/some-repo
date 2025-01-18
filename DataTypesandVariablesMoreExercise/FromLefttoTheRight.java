package DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class FromLefttoTheRight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;


        for (int i = 0; i < n; i++) {
            String[] numbers = sc.nextLine().split(" ");

            if (Double.parseDouble(numbers[0]) > Double.parseDouble(numbers[1])) {
                for (int j = 0; j < numbers[0].length(); j++) {
                    char character = numbers[0].charAt(j);
                    int digit = Integer.parseInt(String.valueOf(character));

                    sum += digit;
                }
            } else {
                for (int j = 0; j < numbers[1].length(); j++) {
                    char character = numbers[1].charAt(j);
                    int digit = Integer.parseInt(String.valueOf(character));

                    sum += digit;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
