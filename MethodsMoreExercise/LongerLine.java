package MethodsMoreExercise;

import java.util.Scanner;

public class LongerLine {


    public static String cordinatesClosestToTheCenter (int x1, int x2, int y1, int y2, int x3 , int x4, int y3, int y4) {


        if (Math.pow(y1 - x1, 2) + Math.pow(y2 - x2, 2) >= Math.pow(y3 - x3, 2) + Math.pow(y4 - x4, 2)) {
            if (Math.pow(x1, 2) + Math.pow(x2, 2) < Math.pow(y1, 2) + Math.pow(y2, 2)) {
                return "(" + x1 + ", " + x2 + ")" + "(" + y1 + ", " + y2 + ")";
            } else {
                return "(" + y1 + ", " + y2 + ")" + "(" + x1 + ", " + x2 + ")";
            }
        } else {
            if (Math.pow(x3, 2) + Math.pow(x4, 2) < Math.pow(y3, 2) + Math.pow(y4, 2)) {
                return "(" + x3 + ", " + x4 + ")" + "(" + y3 + ", " + y4 + ")";
            } else {
                return "(" + y3 + ", " + y4 + ")" + "(" + x3 + ", " + x4 + ")";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(cordinatesClosestToTheCenter(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()),
                Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()),
                Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
    }
}
