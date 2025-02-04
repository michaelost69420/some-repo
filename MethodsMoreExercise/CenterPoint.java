package MethodsMoreExercise;

import java.util.Scanner;

public class CenterPoint {

    private static String pointsCloserToTheCenter (int x1, int x2 , int y1, int y2) {

        if (Math.abs(x1 + x2) <= Math.abs(y1 + y2)) {
            return "(" + x1 + ", " + x2 + ")";
        } else  {
            return "(" + y1 + ", " + y2 + ")";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(pointsCloserToTheCenter(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
    }
}
