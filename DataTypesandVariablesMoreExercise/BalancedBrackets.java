package DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int openingCount = 0;
        int closingCount = 0;
        boolean isBalanced = true;
        String lastBracket = ""; // To keep track of the last bracket seen

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();

            if (input.equals("(")) {
                openingCount++;
                if (lastBracket.equals("(")) {
                    isBalanced = false; // Two consecutive opening brackets
                    break;
                }
                lastBracket = "(";
            } else if (input.equals(")")) {
                closingCount++;
                if (lastBracket.equals(")")) {
                    isBalanced = false; // Two consecutive closing brackets
                    break;
                }
                lastBracket = ")";
            } else {
                lastBracket = ""; // Reset if input is not a bracket
            }

            // Check if closing brackets exceed opening brackets at any point
            if (closingCount > openingCount) {
                isBalanced = false;
                break;
            }
        }

        // Final check to ensure the counts are balanced and no errors occurred
        if (openingCount == closingCount && isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}