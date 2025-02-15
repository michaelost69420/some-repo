package MidExamPreparation_04;

import java.util.*;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we get a sequence of elements in a list
        List<String> numbers = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());

        //2.we loop through 2 integers separated by (" ") until we don't receive "end"
        int count = 1;
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            int index1 = Integer.parseInt(command[0]);
            int index2 = Integer.parseInt(command[1]);

            //3.if the player indexes are unvalid the add 2 elemenets in the middle with the stats "-" + count + "a"
            if (index1 == index2 || (index2 < 0 || index1 < 0) || (index2 >= numbers.size() || index1 >= numbers.size())) {
                numbers.add((numbers.size() / 2), "-" + count + "a");
                numbers.add((numbers.size() / 2), "-" + count + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
                //2.if not, then we just check if the elements are both equal
            } else if (Objects.equals(numbers.get(index1), numbers.get(index2))) {
                String first = numbers.get(index1);
                String second = numbers.get(index2);
                numbers.remove(first);
                numbers.remove(second);
                System.out.printf("Congrats! You have found matching elements - %s!%n", first);
                //if they aren't, then we print to the user to try again
            } else {
                System.out.println("Try again!");
            }

            //4.after we continue with the rest of the steps we went through, we want to check if our list is empty or not
            if (numbers.isEmpty()) {
                System.out.printf("You have won in %d turns!", count);
                return;
            }

            count++;
            input = sc.nextLine();
        }

        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ",numbers));
    }
}
