package DataTypesAndVariablesLab;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class LowerorUpper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String letter = sc.nextLine();

        if (Character.isUpperCase(letter.charAt(0))) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
