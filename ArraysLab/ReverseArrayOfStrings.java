package ArraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] strings = sc.nextLine().split(" ");

        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.print(strings[i] + " ");
        }
    }
}
