package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange {

    private static void charactersInRange (char a, char b) {
        int n;
        int n1;

        if (a > b) {
            n = b;
            n1 = a;
        } else {
            n = a;
            n1 = b;
        }

        for (int i = n + 1; i < n1; i++) {
            System.out.print((char) i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        charactersInRange(sc.nextLine().charAt(0), sc.nextLine().charAt(0));
    }
}
