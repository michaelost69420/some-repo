package MidExamPreparation_04;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we will receive inputs of prices of part of a computer build until we get 1 type of the customer
        String input = sc.nextLine();
        double total = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            //2.we add to the total price until we don't receive 1 of the inputs required in the while loop but if we have
            //an unvalid value, then we print it to the console
            if (Double.parseDouble(input) >= 0) {
                total += Double.parseDouble(input);
            } else {
                System.out.println("Invalid price!");
            }
            input = sc.nextLine();
        }

        //3.we get the full price with a tax but if our input was "special" we will give a 10% discount
        double full = total * 1.20;

        double actualFull;
        if (input.equals("special")) {
            actualFull = full * 0.9;
        } else {
            actualFull = full;
        }

        //4.to get the tax part we will divide the full to the total
        double taxes = full - total;

        //bonus: if the total is 0, then we also print that there is an invalid order on the console
        if (total == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", total, taxes, actualFull);
        }
    }
}
