package MethodsLab;

import java.util.Scanner;

public class Orders {

    private static double order (String item, int amount) {
        double total = 0;
        switch (item) {
            case "coffee" -> total = amount * 1.50;
            case "water" -> total = amount * 1.00;
            case "coke" -> total = amount * 1.40;
            case "snacks" -> total = amount * 2.00;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("%.2f", order(sc.nextLine(), Integer.parseInt(sc.nextLine())));
    }
}
