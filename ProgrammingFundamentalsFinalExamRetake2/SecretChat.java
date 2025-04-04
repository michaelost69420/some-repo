package ProgrammingFundamentalsFinalExamRetake2;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String input = sc.nextLine();
        while (!input.equals("Reveal")) {
            String[] command = input.split(":\\|:");

            switch (command[0]) {
                case "InsertSpace" -> {
                    StringBuilder strBuilder = new StringBuilder(txt);
                    strBuilder.insert(Integer.parseInt(command[1]), " ");
                    txt = String.valueOf(strBuilder);
                    System.out.println(txt);
                }
                case "Reverse" -> {
                    if (txt.contains(command[1])) {
                        txt = txt.replace(command[1], "");
                        for (int i = command[1].length() - 1; i >= 0; i--) {
                            txt += command[1].charAt(i);
                        }
                        System.out.println(txt);
                    } else {
                        System.out.println("error");
                    }
                }
                case "ChangeAll" -> {
                    txt = txt.replace(command[1], command[2]);
                    System.out.println(txt);
                }
            }

            input = sc.nextLine();
        }

        System.out.printf("You have a new text message: %s", txt);
    }
}
