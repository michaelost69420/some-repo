package ObjectsAndClassesLab.BigFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());


        BigInteger add = new BigInteger("1");
        for (int i = n; i >= 1; i--) {
            BigInteger integer = new BigInteger(String.valueOf(i));
            add = add.multiply(integer);
        }

        System.out.println(add);
    }
}
