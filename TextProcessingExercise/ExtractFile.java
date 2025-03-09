package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] division1 = sc.nextLine().split("\\\\");
        String[] fileInfo = division1[division1.length - 1].split("\\.");

        System.out.printf("File name: %s%n", fileInfo[0]);
        System.out.printf("File extension: %s", fileInfo[1]);
    }
}
