package ProgrammingFundamentalsFinalExam1;

import java.util.Scanner;
import java.util.regex.*;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Pattern pattern = Pattern.compile("[@][#]+(?<text>[A-Z][A-Za-z0-9]{4,}[A-Z])[@][#]+");
        for (int i = 0; i < n; i++) {
            String txt = sc.nextLine();

            Matcher matcher = pattern.matcher(txt);

            if (matcher.find()) {
                String result = getAllNumberInString(matcher.group("text"));
                System.out.printf("Product group: %s%n", result);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }

    private static String getAllNumberInString(String txt) {
        String str = "";
        for (char character : txt.toCharArray()) {
            if (Character.isDigit(character)) {
                str += character;
            }
        }

        if (str.isEmpty()) {
            return "00";
        } else {
            return str;
        }
    }
}
