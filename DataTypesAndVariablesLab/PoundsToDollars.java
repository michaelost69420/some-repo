package DataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte pounds = Byte.parseByte(sc.nextLine());

        double dollar = pounds * 1.36;

        System.out.printf("%.3f", dollar);
    }
}
