package TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String removingPart = sc.nextLine();
        String currentString = sc.nextLine();

        while (currentString.contains(removingPart)) {
            currentString = currentString.replace(removingPart, "");
        }

        System.out.println(currentString);
    }
}
