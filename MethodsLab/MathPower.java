package MethodsLab;

import java.util.Scanner;

public class MathPower {
     private static int power (int number, int index) {
         int result = 1;
         result = (int) Math.pow(number, index);
         return result;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(power(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
    }
}
