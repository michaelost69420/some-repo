package ProgrammingFundamentalsFinalExam2;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rawKey = sc.nextLine();

        String input = sc.nextLine();
        while (!input.equals("Generate")) {
            String[] command = input.split(">>>");

            switch (command[0]) {
                case "Contains" -> {
                    if (rawKey.contains(command[1])) {
                        System.out.printf("%s contains %s%n", rawKey, command[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                }
                case "Flip" -> {
                    String[] command1 = command[1].split("/");
                    String subStr = rawKey.substring(Integer.parseInt(command[2]), Integer.parseInt(command[3]));
                    switch (command1[0]) {
                        case "Upper" -> {
                            StringBuilder stringBuilder = new StringBuilder(rawKey);
                            stringBuilder.replace(Integer.parseInt(command[2]), Integer.parseInt(command[3]), subStr.toUpperCase());
                            rawKey = String.valueOf(stringBuilder);
                        }
                        case "Lower" -> {
                            StringBuilder stringBuilder = new StringBuilder(rawKey);
                            stringBuilder.replace(Integer.parseInt(command[2]), Integer.parseInt(command[3]), subStr.toLowerCase());
                            rawKey = String.valueOf(stringBuilder);
                        }
                    }
                    System.out.println(rawKey);
                }
                case "Slice" -> {
                    StringBuilder strBuilder = new StringBuilder(rawKey);
                    strBuilder.replace(Integer.parseInt(command[1]), Integer.parseInt(command[2]), "");
                    rawKey = String.valueOf(strBuilder);
                    System.out.println(rawKey);
                }
            }

            input = sc.nextLine();
        }

        System.out.printf("Your activation key is: %s", rawKey);
    }
}
