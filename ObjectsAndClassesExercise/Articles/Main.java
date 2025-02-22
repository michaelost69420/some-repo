package ObjectsAndClassesExercise.Articles;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(": ");

            switch (command[0]) {
                case "Edit" -> numbers.set(1, command[1]);
                case "ChangeAuthor" -> numbers.set(2, command[1]);
                case "Rename" -> numbers.set(0, command[1]);
            }
        }

        Article article = new Article(numbers.get(0), numbers.get(1), numbers.get(2));

        System.out.println(article);
    }
}
