package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ExactSumofRealNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte amount = Byte.parseByte(sc.nextLine());


        double value2;
        double afterDecimalPoint = 0;
        double value1;
        long value;
        long sum = 0;
        double sum1 = 0;
        for (int i = 0; i < amount; i++) {
            String number = sc.nextLine();

            if (number.contains(".")) {
                value2 = Double.parseDouble(number);
                value1 = (long) value2;
                afterDecimalPoint = value2 - value1;

                sum1 += value1;

            } else {
                value = Long.parseLong(number);
                sum += value;
            }

        }

        if (sum1 == 0) {
            System.out.printf("%d", sum);
        } else {
            System.out.printf("%f", sum1 + afterDecimalPoint);
        }

    }
}
