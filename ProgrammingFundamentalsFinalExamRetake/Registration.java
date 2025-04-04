package ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        String input = sc.nextLine();
        while (!input.equals("Registration")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Letters" -> {
                    switch (command[1]) {
                        case "Lower" -> {
                            name = name.toLowerCase();
                            System.out.println(name);
                        }
                        case "Upper" -> {
                            name = name.toUpperCase();
                            System.out.println(name);
                        }
                    }
                }
                case "Reverse" -> {
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[2]) < name.length()) {
                        String subStr = name.substring(Integer.parseInt(command[1]), Integer.parseInt(command[2]) + 1);
                        for (int i = subStr.length() - 1; i >= 0; i--) {
                            System.out.print(subStr.charAt(i));
                        }
                        System.out.println();
                    }
                }
                case "Substring" -> {
                    if (name.contains(command[1])) {
                        name = name.replace(command[1], "");
                        System.out.println(name);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n", name, command[1]);
                    }
                }
                case "Replace" -> {
                    name = name.replace(command[1], "-");
                    System.out.println(name);
                }
                case "IsValid" -> {
                    if (name.contains(command[1])) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.", command[1]);
                    }
                }
            }

            input = sc.nextLine();
        }
    }
}
