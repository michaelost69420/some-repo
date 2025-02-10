package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("3:1")) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "merge" -> {
                    int first = Integer.parseInt(command[1]);
                    int second = Integer.parseInt(command[2]);

                    if (second >= names.size()) {
                        second = names.size() - 1;
                    }
                    if (first < 0 || first > second) {
                        first = 0;
                    }

                    String currentName = "";
                    for (int i = first; i <= second; i++) {
                        currentName += names.get(i);
                    }

                    for (int i = first; i <= second; i++) {
                        names.remove(names.get(first));
                    }
                    names.add(first, currentName);
                    currentName = "";
                }
                case "divide" -> {
                    String theCurrentString = names.get(Integer.parseInt(command[1]));
                    names.remove(Integer.parseInt(command[1]));
                    String Final;
                    int firstIndex = 0;
                    int addition = 0;
                    for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                        int currentIndex = Integer.parseInt(command[1]);
                        if (i != Integer.parseInt(command[2]) - 1) {
                            Final = theCurrentString.substring(firstIndex, theCurrentString.length() / Integer.parseInt(command[2]) + addition);
                            firstIndex = theCurrentString.length() / Integer.parseInt(command[2]) + addition;
                            addition += theCurrentString.length() / Integer.parseInt(command[2]);
                        } else {
                            Final = theCurrentString.substring(firstIndex);
                        }
                        names.add(currentIndex + i, Final);
                    }
                }
            }

            input = sc.nextLine();
        }

        names.forEach(n -> System.out.print(n + " "));
    }
}
