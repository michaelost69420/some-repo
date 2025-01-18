package DataTypesandVariablesExercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char character = number.charAt(i);
            int numberPart = Integer.parseInt(String.valueOf(character));

            sum += numberPart;
        }

        System.out.println(sum);
    }
}
