package RegularExpressionsExercises;

import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.regex.*;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Pattern pattern = Pattern.compile("_\\.+[A-Z][A-Za-z0-9]{4,}[A-Z]_\\.+");
        for (int i = 0; i < n; i++) {
            String password = sc.nextLine();

            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < password.length(); j++) {
                    if (Character.isDigit(password.charAt(j))) {
                        stringBuilder.append(password.charAt(j));
                    }
                }

                if (stringBuilder.isEmpty()) {
                    System.out.println("Group: default");
                } else {
                    System.out.printf("Group: %d%n", Integer.parseInt(String.valueOf(stringBuilder)));
                }
            } else {
                System.out.println("Invalid pass!");
            }
        }
    }
}
