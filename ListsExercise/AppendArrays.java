package ListsExercise;

import java.util.*;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split("\\|")).toList();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            String[] finalForm = numbers.get(i).trim().split(" ");
            for (String s : finalForm) {
                if (!s.isEmpty()) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
