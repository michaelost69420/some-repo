package ArraysMoreExercise;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = nums.length;
        int[] len = new int[n];
        int[] prev = new int[n];
        Arrays.fill(len, 1);
        Arrays.fill(prev, -1);

        int maxLen = 0;
        int lastIndex = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && len[i] < len[j] + 1) {
                    len[i] = len[j] + 1;
                    prev[i] = j;
                }
            }
            if (len[i] > maxLen) {
                maxLen = len[i];
                lastIndex = i;
            }
        }

            // Reconstruct LIS
        List<Integer> lis = new ArrayList<>();
        while (lastIndex != -1) {
            lis.add(nums[lastIndex]);
            lastIndex = prev[lastIndex];
        }
        Collections.reverse(lis);
        lis.forEach(e -> System.out.print(e + " "));
    }
}

