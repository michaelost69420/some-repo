package DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte amount = Byte.parseByte(sc.nextLine());


        BigDecimal sum = BigDecimal.ZERO;

        for (int i = 0; i < amount; i++) {
            BigDecimal number = sc.nextBigDecimal();
            sum = sum.add(number);
        }

        System.out.println(sum.toPlainString());

    }
}
