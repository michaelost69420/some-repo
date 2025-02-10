package ProgrammingFundamentalsMidExamPractice;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        •	On the first line – quantity food in kilograms - a floating-point number in the range [0.0 – 10000.0].
        •	On the second line – quantity hay in kilograms - a floating-point number in the range [0.0 – 10000.0].
        •	On the third line – quantity cover in kilograms - a floating-point number in the range [0.0 – 10000.0].
        •	On the fourth line – guinea's weight in kilograms - a floating-point number in the range [0.0 – 10000.0].
         */

        double food = Double.parseDouble(sc.nextLine());
        double hay = Double.parseDouble(sc.nextLine());
        double cover = Double.parseDouble(sc.nextLine());
        double weight = Double.parseDouble(sc.nextLine());

        double foodInGrams = (food * 1000);
        double hayInGrams = (hay * 1000);
        double coverInGrams = (cover * 1000);
        double weightInGrams = (weight * 1000);

        for (int i = 1; i <= 30; i++) {
            foodInGrams -= 300;
            if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
            if (i % 2 == 0) {
                hayInGrams -= foodInGrams * 0.05;
            }
            if (i % 3 == 0) {
                coverInGrams -= weightInGrams / 3;
            }
        }

        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);
    }
}
