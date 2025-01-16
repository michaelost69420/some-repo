package DataTypesAndVariablesLab;

import java.util.Scanner;

public class FromMetersToKiloMeters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        short meters = Short.parseShort(sc.nextLine());

        double converting = (double) meters / 1000;

        System.out.printf("%.2f", converting);
    }
}
