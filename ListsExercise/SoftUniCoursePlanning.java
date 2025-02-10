package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String input = sc.nextLine();
        List<String> courseWithExercise = new ArrayList<>();
        while (!input.equals("course start")) {

            //1. we check if we have a specific element with an exercise to add to another separated list
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.contains(numbers.get(i) + "-Exercise")) {
                    courseWithExercise.add(numbers.get(i));
                }
            }

            String[] command = input.split(":");

            //2. we use the first index of the array command to check the methods given to us to use
            /*
            •	Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
            •	Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
            •	Remove:{lessonTitle} - remove the lesson, if it exists
            •	Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
            •	Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index, if the lesson exists and there is no exercise already, in the following format: "{lessonTitle}-Exercise". If the lesson doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.
            Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any, which follow the lessons.
             */
            switch (command[0]) {
                //3.add the element if it's not in the list
                case "Add" -> {
                    if (!numbers.contains(command[1])) {
                        numbers.add(command[1]);
                    }
                }
                //3.insert the element if it's not in the list
                case "Insert" -> {
                    if (!numbers.contains(command[1]) && (Integer.parseInt(command[2]) >= 0 && Integer.parseInt(command[2]) < numbers.size())) {
                        numbers.add(Integer.parseInt(command[2]), (command[1]));
                    }
                }
                //4.remove the element if it's in the list and if we have a lesson with an exercise we remove the exercise as well
                case "Remove" -> {
                    numbers.remove(command[1]);
                    if (courseWithExercise.contains(command[1])) {
                        numbers.remove(command[1] + "-Exercise");
                        courseWithExercise.remove(command[1]);
                    }
                }
                //5.we first check if both of the values we want a swap contain an exercise if not we check if at least
                //one does and if neither do than we just swap them like usual
                case "Swap" -> {
                    int index;
                    int index1;
                    List<String> list1 = new ArrayList<>();
                    List<String> list2 = new ArrayList<>();
                    if (courseWithExercise.contains(command[1]) && courseWithExercise.contains(command[2])) {
                        index = numbers.indexOf(command[1]);
                        index1 = numbers.indexOf(command[2]);
                        list1.add(command[1]);
                        list1.add(command[1] + "-Exercise");
                        list2.add(command[2]);
                        list2.add(command[2] + "-Exercise");

                        numbers.set(index, list2.getFirst());
                        numbers.set(index + 1, list2.get(1));
                        numbers.set(index1, list1.getFirst());
                        numbers.set(index1 + 1, list1.get(1));
                    } else if (courseWithExercise.contains(command[1]) || courseWithExercise.contains(command[2])) {
                        String storedValue;
                        if (courseWithExercise.contains(command[1])) {
                            list1.add(command[1]);
                            list1.add(command[1] + "-Exercise");
                            index1 = numbers.indexOf(command[1]);
                            index = numbers.indexOf(command[2]);
                            storedValue = command[2];
                        } else {
                            list1.add(command[2]);
                            list1.add(command[2] + "-Exercise");
                            index1 = numbers.indexOf(command[2]);
                            index = numbers.indexOf(command[1]);
                            storedValue = command[1];
                        }

                        numbers.addAll(index + 1, list1);
                        numbers.remove(storedValue);
                        numbers.set(index1 + 1, storedValue);
                        numbers.remove(index1 + 2);
                    } else {
                        String stored = command[1];
                        index = numbers.indexOf(command[1]);
                        index1 = numbers.indexOf(command[2]);
                        numbers.set(index, command[2]);
                        numbers.set(index1, stored);
                    }
                }
                //6.in this case we will just add and exercise to our lesson and if it doesn't exist then we add the lesson at the end with the exercise
                case "Exercise" -> {
                    if (numbers.contains(command[1])) {
                        int index = numbers.indexOf(command[1]);
                        numbers.add(index + 1, command[1] + "-Exercise");
                    } else {
                        numbers.add(command[1]);
                        numbers.add(command[1] + "-Exercise");
                    }
                }
            }

            input = sc.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i + 1 + "." + numbers.get(i));
        }
    }
}
