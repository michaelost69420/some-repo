package ArraysExercise;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] firstArray = sc.nextLine().split(" ");
        String[] secondArray = sc.nextLine().split(" ");


        String output = "";
        LinkedList<String> firstArray1 = new LinkedList<>(Arrays.asList(firstArray));
        for (String element : secondArray) {
            if (firstArray1.contains(element)) {
                output += element + " ";
            }
        }

        System.out.println(output);
    }
}
