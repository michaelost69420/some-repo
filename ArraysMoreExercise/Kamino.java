package ArraysMoreExercise;

import java.util.*;

public class Kamino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dnaLength = Integer.parseInt(sc.nextLine());

        int bestLength = -1;
        int bestIndex = -1;
        int bestSum = -1;
        int bestSequenceIndex = 0;
        int sequenceCount = 0;
        int[] bestSequence = new int[dnaLength];

        String input;
        while (!(input = sc.nextLine()).equals("Clone them!")) {
            sequenceCount++;
            int[] dna = Arrays.stream(input.split("!+")).mapToInt(Integer::parseInt).toArray();

            int currentLength = 0;
            int maxLength = 0;
            int currentStartIndex = -1;
            int currentSum = 0;

            for (int i = 0; i < dna.length; i++) {
                currentSum += dna[i];
                if (dna[i] == 1) {
                    if (currentStartIndex == -1) {
                        currentStartIndex = i;
                    }
                    currentLength++;
                } else {
                    currentLength = 0;
                    currentStartIndex = -1;
                }

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }

            boolean isBetter = false;
            if (maxLength > bestLength) {
                isBetter = true;
            } else if (maxLength == bestLength) {
                if (currentStartIndex < bestIndex) {
                    isBetter = true;
                } else if (currentStartIndex == bestIndex && currentSum > bestSum) {
                    isBetter = true;
                }
            }

            if (isBetter) {
                bestLength = maxLength;
                bestIndex = currentStartIndex;
                bestSum = currentSum;
                bestSequenceIndex = sequenceCount;
                bestSequence = dna.clone();
            }
        }

        System.out.println("Best DNA sample " + bestSequenceIndex + " with sum: " + bestSum + ".");
        for (int gene : bestSequence) {
            System.out.print(gene + " ");
        }
    }
}
