package DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class FloaatingEquality1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        double diff = Math.abs(a - b);

        if (diff < 0.000001) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
