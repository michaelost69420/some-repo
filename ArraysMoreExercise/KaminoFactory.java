package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());

        int bestSequenceIndex = 0;
        int bestSequenceSum = 0;
        int bestSequenceStartIndex = Integer.MAX_VALUE;
        int bestSequenceLength = 0;
        int[] bestSequence = new int[dnaLength];
        int sampleIndex = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Clone them!")) {
                break;
            }

            int[] dnaSequence = Arrays.stream(input.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            sampleIndex++;

            int currentMaxLength = 0;
            int currentStartIndex = 0;
            int currentLength = 0;

            for (int i = 0; i < dnaSequence.length; i++) {
                if (dnaSequence[i] == 1) {
                    currentLength++;
                    if (currentLength > currentMaxLength) {
                        currentMaxLength = currentLength;
                        currentStartIndex = i - currentLength + 1;
                    }
                } else {
                    currentLength = 0;
                }
            }

            int currentSum = Arrays.stream(dnaSequence).sum();

            if (currentMaxLength > bestSequenceLength ||
                    (currentMaxLength == bestSequenceLength && currentStartIndex < bestSequenceStartIndex) ||
                    (currentMaxLength == bestSequenceLength && currentStartIndex == bestSequenceStartIndex && currentSum > bestSequenceSum)) {

                bestSequenceLength = currentMaxLength;
                bestSequenceStartIndex = currentStartIndex;
                bestSequenceSum = currentSum;
                bestSequenceIndex = sampleIndex;
                bestSequence = dnaSequence;
            }
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSequenceSum);
        System.out.println(Arrays.toString(bestSequence).replaceAll("[\\[\\],]", ""));
    }
}
