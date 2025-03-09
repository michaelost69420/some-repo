package TextProcessingMoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String name = "";
        int age = 0;
        for (int i = 0; i < n; i++) {
            String[] sequenceOfStrings = sc.nextLine().split(" ");
            for (String sequenceOfString : sequenceOfStrings) {
                if (sequenceOfString.contains("@") && sequenceOfString.contains("|")) {
                    name = sequenceOfString.substring(1, sequenceOfString.length() - 1);
                } else if (sequenceOfString.contains("#") && sequenceOfString.contains("*")) {
                    age = Integer.parseInt(sequenceOfString.substring(1, sequenceOfString.length() - 1));
                }
            }

            if (!(name.isEmpty() && age == 0)) {
                System.out.printf("%s is %d years old.%n", name, age);
            }

            name = "";
            age = 0;
        }
    }
}