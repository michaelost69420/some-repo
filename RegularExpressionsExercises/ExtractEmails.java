package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();

        String fullEmail = "([A-Za-z0-9]*)([-_.]?)([A-Za-z0-9]*)\\@[A-Za-z]+([\\.\\-]?[A-Za-z]*)*\\.[A-Za-z]+";

        Pattern pattern = Pattern.compile(fullEmail);
        Matcher matcher = pattern.matcher(email);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
