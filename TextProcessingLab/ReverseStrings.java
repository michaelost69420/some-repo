package TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String currentString = sc.nextLine();

        while (!currentString.equals("end")) {
            String reversedString = new StringBuilder(currentString).reverse().toString();
            System.out.printf("%s = %s%n", currentString, reversedString);

            currentString = sc.nextLine();
        }
    }
}
