package ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String input = sc.nextLine();
        while (!input.equals("Travel")) {
            String[] command = input.split(":");

            switch (command[0]) {
                case "Add Stop" -> {
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < txt.length()) {
                        StringBuilder strBuilder = new StringBuilder(txt);
                        strBuilder.insert(Integer.parseInt(command[1]), command[2]);
                        txt = String.valueOf(strBuilder);
                    }
                    System.out.println(txt);
                }
                case "Remove Stop" -> {
                    if ((Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < txt.length()) && (Integer.parseInt(command[2]) >= 0 && Integer.parseInt(command[2]) < txt.length())) {
                        StringBuilder strBuilder = new StringBuilder(txt);
                        strBuilder.replace(Integer.parseInt(command[1]), Integer.parseInt(command[2]) + 1, "");
                        txt = String.valueOf(strBuilder);
                    }
                    System.out.println(txt);
                }
                case "Switch" -> {
                    txt = txt.replace(command[1], command[2]);
                    System.out.println(txt);
                }
            }

            input = sc.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", txt);
    }
}
