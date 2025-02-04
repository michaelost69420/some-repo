package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {

    private static int addingAndSubtracting (int n1, int n2, int n3) {
        return (n1 + n2) - n3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(addingAndSubtracting(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
    }
}
