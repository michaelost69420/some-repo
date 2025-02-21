package ObjectsAndClassesLab.SumBigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(sc.nextLine());
        BigInteger bigInteger1 = new BigInteger(sc.nextLine());

        BigInteger add = bigInteger1.add(bigInteger);

        System.out.println(add);
    }
}
