package FinalExamSolving;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String decryptedMessage = sc.nextLine();

        String input = sc.nextLine();
        while (!input.equals("Finish")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Replace" -> {
                    decryptedMessage = decryptedMessage.replaceAll(command[1], command[2]);
                    System.out.println(decryptedMessage);
                }
                case "Cut" -> {
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[2]) < decryptedMessage.length()) {
                        StringBuilder stringBuilder = new StringBuilder(decryptedMessage);
                        stringBuilder.replace(Integer.parseInt(command[1]), Integer.parseInt(command[2]) + 1, "");
                        decryptedMessage = stringBuilder.toString();
                        System.out.println(decryptedMessage);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                }
                case "Make" -> {
                    if (command[1].equals("Upper")) {
                        decryptedMessage = decryptedMessage.toUpperCase();
                    } else {
                        decryptedMessage = decryptedMessage.toLowerCase();
                    }
                    System.out.println(decryptedMessage);
                }
                case "Check" -> {
                    if (decryptedMessage.contains(command[1])) {
                        System.out.printf("Message contains %s%n", command[1]);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", command[1]);
                    }
                }
                case "Sum" -> {
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[2]) < decryptedMessage.length()) {
                        String subStr = decryptedMessage.substring(Integer.parseInt(command[1]), Integer.parseInt(command[2]) + 1);
                        int sum = 0;
                        for (int i = 0; i < subStr.length(); i++) {
                            sum += subStr.charAt(i);
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                }
            }

            input = sc.nextLine();
        }

    }
}
