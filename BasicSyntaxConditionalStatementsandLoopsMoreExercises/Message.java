package BasicSyntaxConditionalStatementsandLoopsMoreExercises;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int n1 = Integer.parseInt(sc.nextLine());

            switch (n1) {
                case 2 -> System.out.print("a");
                case 22 -> System.out.print("b");
                case 222 -> System.out.print("c");
                case 3 -> System.out.print("d");
                case 33 -> System.out.print("e");
                case 333 -> System.out.print("f");
                case 4 -> System.out.print("g");
                case 44 -> System.out.print("h");
                case 444 -> System.out.print("i");
                case 5 -> System.out.print("j");
                case 55 -> System.out.print("k");
                case 555 -> System.out.print("l");
                case 6 -> System.out.print("m");
                case 66 -> System.out.print("n");
                case 666 -> System.out.print("o");
                case 7 -> System.out.print("p");
                case 77 -> System.out.print("q");
                case 777 -> System.out.print("r");
                case 7777 -> System.out.print("s");
                case 8 -> System.out.print("t");
                case 88 -> System.out.print("u");
                case 888 -> System.out.print("v");
                case 9 -> System.out.print("w");
                case 99 -> System.out.print("x");
                case 999 -> System.out.print("y");
                case 9999 -> System.out.print("z");
                case 0 -> System.out.print(" ");
            }
        }
    }
}
