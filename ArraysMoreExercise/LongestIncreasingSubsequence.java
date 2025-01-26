package ArraysMoreExercise;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<List<Integer>> allSubsequences = new ArrayList<>();

        // Iterate through each number
        for (int i = 0; i < numbers.length; i++) {
            List<Integer> currentSubsequence = new ArrayList<>();
            currentSubsequence.add(numbers[i]);

            // Check all previous numbers
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i] &&
                        allSubsequences.get(j).size() + 1 > currentSubsequence.size()) {
                    currentSubsequence = new ArrayList<>(allSubsequences.get(j));
                    currentSubsequence.add(numbers[i]);
                }
            }

            // Store the current LIS ending at index i
            allSubsequences.add(currentSubsequence);
        }

        // Find the longest subsequence
        List<Integer> longestSubsequence = new ArrayList<>();
        for (List<Integer> subsequence : allSubsequences) {
            if (subsequence.size() > longestSubsequence.size()) {
                longestSubsequence = subsequence;
            }
        }

        // Print the longest increasing subsequence
        for (int num : longestSubsequence) {
            System.out.print(num + " ");
        }
    }
}
