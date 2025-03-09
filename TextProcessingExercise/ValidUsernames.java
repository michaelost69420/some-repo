package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sequenceOfPasswords = sc.nextLine().split(", ");

        
        boolean isValid = false;
        for (String sequenceOfPassword : sequenceOfPasswords) {
            if ((sequenceOfPassword.length() >= 3 && sequenceOfPassword.length() <= 16)) {
                for (int i = 0; i < sequenceOfPassword.length(); i++) {
                    if (Character.isLetterOrDigit(sequenceOfPassword.charAt(i))) {
                        isValid = true;
                    } else if (!(sequenceOfPassword.contains("-") || sequenceOfPassword.contains("_"))) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    System.out.println(sequenceOfPassword);
                }
            }
        }
    }
}
