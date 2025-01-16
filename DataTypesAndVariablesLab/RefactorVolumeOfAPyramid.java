package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorVolumeOfAPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length, width, height;
        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());
        double total = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", total);

    }
}
