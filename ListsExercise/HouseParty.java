package ListsExercise;

import java.util.*;

public class HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");

            if (input[1].equals("is") && input[2].equals("going!")) {
                if (list.contains(input[0])) {
                    System.out.println(input[0] + " is already in the list!");
                } else {
                    list.add(input[0]);
                }
            } else if (input[1].equals("is") && input[2].equals("not")) {
                if (!list.contains(input[0])) {
                    System.out.println(input[0] + " is not in the list!");
                } else {
                    list.remove(input[0]);
                }
            }
        }

        list.forEach(System.out::println);
    }
}
