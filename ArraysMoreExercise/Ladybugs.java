package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ladybugs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        int[] field = new int[size];
        int[] initialIndexes = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index : initialIndexes) {
            if (index >= 0 && index < size) {
                field[index] = 1;
            }
        }

        String command;
        while (!(command = sc.nextLine()).equals("end")) {
            String[] tokens = command.split(" ");
            int ladybugIndex = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if (ladybugIndex < 0 || ladybugIndex >= size || field[ladybugIndex] == 0) {
                continue;
            }

            field[ladybugIndex] = 0;
            int position = ladybugIndex;

            while (true) {
                position += direction.equals("right") ? flyLength : -flyLength;
                if (position < 0 || position >= size) {
                    break;
                }
                if (field[position] == 0) {
                    field[position] = 1;
                    break;
                }
            }
        }

        Arrays.stream(field).forEach(e -> System.out.print(e + " "));
    }
}
