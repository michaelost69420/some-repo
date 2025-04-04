package ProgrammingFundamentalsFinalExamRetake1;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String str1 = sc.nextLine();
        while (!str1.equals("Decode")) {
            String[] command = str1.split("\\|");

            switch (command[0]) {
                case "Move" -> {
                    String replacement;
                    if (str.length() >= Integer.parseInt(command[1])) {
                        replacement = str.substring(0, Integer.parseInt(command[1]));
                    } else {
                        replacement = str;
                    }

                    str = str.replace(replacement, "");

                    for (int i = 0; i < replacement.length(); i++) {
                        str += replacement.charAt(i);
                    }

                }

                case "Insert" -> {
                    StringBuilder strBuilder = new StringBuilder(str);
                    strBuilder.insert(Integer.parseInt(command[1]), command[2]);
                    str = String.valueOf(strBuilder);
                }
                case "ChangeAll" -> str = str.replace(command[1], command[2]);


            }

            str1 = sc.nextLine();
        }

        System.out.printf("The decrypted message is: %s", str);
    }
}
