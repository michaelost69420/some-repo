package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    private static String bigger (String dataType, String f, String s) {
        String bigger ="";
        switch (dataType) {
            case "int" -> {
                int n1 = Integer.parseInt(f);
                int n2 = Integer.parseInt(s);
                if (n1 > n2) {
                    bigger = String.valueOf(n1);
                } else {
                    bigger = String.valueOf(n2);
                }
            }
            case "char" -> {
                if (f.charAt(0) > s.charAt(0)) {
                    bigger = String.valueOf(f.charAt(0));
                } else {
                    bigger = String.valueOf(s.charAt(0));
                }
            }
            case "string" -> {
                if (f.compareTo(s) >= 0) {
                    bigger = f;
                } else {
                    bigger = s;
                }


            }
        }
        return bigger;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(bigger(sc.nextLine(),sc.nextLine(),sc.nextLine()));
    }
}
