package TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger number1 = new BigInteger(sc.nextLine());
        BigInteger number2 = new BigInteger(sc.nextLine());

        System.out.println(number1.multiply(number2));
    }
}
