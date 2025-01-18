package DataTypesandVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String biggestModel = "";
        double biggest = 0;
        double volume;
        for (int i = 0; i < n; i++) {
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());

            volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggest) {
                biggestModel = model;
                biggest = volume;
            }
        }
        System.out.println(biggestModel);
    }
}
