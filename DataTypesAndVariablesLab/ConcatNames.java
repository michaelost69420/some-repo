package DataTypesAndVariablesLab;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String delimiter = sc.nextLine();

        System.out.println(firstName + delimiter + lastName);
    }
}
