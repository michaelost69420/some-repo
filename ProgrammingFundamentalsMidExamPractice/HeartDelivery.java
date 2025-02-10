package ProgrammingFundamentalsMidExamPractice;

import java.util.*;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String input = sc.nextLine();
        int currentIndex = 0;
        int requierdIndex;
        while (!input.equals("Love!")) {
            String[] command = input.split(" ");

            //1.check if the index we want to go to is outside the neighborhood
            if (currentIndex + Integer.parseInt(command[1]) <= numbers.length - 1) {
                requierdIndex = currentIndex + Integer.parseInt(command[1]);
            } else {
                requierdIndex = 0;
            }
            currentIndex = requierdIndex;
            //2.check if the neighborhood already has a valentine,s day
            if (numbers[requierdIndex] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", requierdIndex);
            } else {
                //3.if not then we will check if the neighborhood that we went gets count of zero or not
                numbers[requierdIndex] -= 2;
                if (numbers[requierdIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", requierdIndex);
                }
            }
            input = sc.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        int[] finalArray = Arrays.stream(numbers).filter(n -> n != 0).toArray();
        if (finalArray.length == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", finalArray.length);
        }
    }
}
