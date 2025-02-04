package MethodsMoreExercise;

import java.util.Scanner;

public class DataTypes {

    public static void dataType (String dataType, String value) {

        switch (dataType) {
            case "int" -> System.out.println(Integer.parseInt(value) * 2);
            case "real" -> System.out.printf("%.2f", Double.parseDouble(value) * 1.5);
            case "string" -> System.out.println("$" + value + "$");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dataType(sc.nextLine(), sc.nextLine());
    }
}
