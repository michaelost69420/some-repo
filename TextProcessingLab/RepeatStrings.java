package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sequenceOfStrings = sc.nextLine().split(" ");

        for (String sequenceOfString : sequenceOfStrings) {
            for (int i = 0; i < sequenceOfString.length(); i++) {
                System.out.print(sequenceOfString);
            }
        }
    }
}
