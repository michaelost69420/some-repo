package MethodsLab;

import java.util.Scanner;

public class RepeatString {

    private static void repeat (String txt, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(txt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        repeat(sc.nextLine(), Integer.parseInt(sc.nextLine()));
    }
}
