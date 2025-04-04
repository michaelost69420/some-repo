package ProgrammingFundamentalsFinalExam1;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        String input = sc.nextLine();
        while (!input.equals("Done")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "TakeOdd" -> {
                    StringBuilder strBuilder = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            strBuilder.append(password.charAt(i));
                        }
                    }
                    password = strBuilder.toString();
                    System.out.println(password);
                }
                case "Cut" -> {
                    StringBuilder strBuilder = new StringBuilder(password);
                    strBuilder.replace(Integer.parseInt(command[1]), Integer.parseInt(command[1]) + Integer.parseInt(command[2]), "");
                    password = strBuilder.toString();
                    System.out.println(password);
                }
                case "Substitute" -> {
                    if (password.contains(command[1])) {
                        password = password.replace(command[1], command[2]);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                }
            }

            input = sc.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }
}
