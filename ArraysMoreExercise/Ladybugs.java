package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ladybugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        int[] field = new int[fieldSize];

        int[] initialPositions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int position : initialPositions) {
            if (position >= 0 && position < fieldSize) {
                field[position] = 1;
            }
        }

        String command;
        while (!(command = scanner.nextLine()).equals("end")) {
            String[] tokens = command.split(" ");
            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if (index < 0 || index >= fieldSize || field[index] == 0) {
                continue;
            }
            field[index] = 0;

            int newPosition = index;
            while (true) {
                if (direction.equals("right")) {
                    newPosition += flyLength;
                } else if (direction.equals("left")) {
                    newPosition -= flyLength;
                }

                if (newPosition < 0 || newPosition >= fieldSize) {
                    break; // The ladybug is gone
                }

                if (field[newPosition] == 0) {
                    field[newPosition] = 1;
                    break;
                }
            }
        }

        for (int cell : field) {
            System.out.print(cell + " ");
        }
    }
}
