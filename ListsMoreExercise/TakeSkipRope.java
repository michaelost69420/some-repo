package ListsMoreExercise;

import java.util.*;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        List<Character> onlyTxt = new ArrayList<>();
        List<Integer> onlyDigits = new ArrayList<>();

        for (int i = 0; i < txt.length(); i++) {
            if (isInteger(txt.charAt(i))) {
                onlyDigits.add(Integer.parseInt(String.valueOf(txt.charAt(i))));
            } else {
                onlyTxt.add(txt.charAt(i));
            }
        }

        List<Integer> take = new ArrayList<>();
        List<Integer> skip = new ArrayList<>();
        for (int i = 0; i < onlyDigits.size(); i++) {
            if (i % 2 == 0) {
                take.add(onlyDigits.get(i));
            } else {
                skip.add(onlyDigits.get(i));
            }
        }

        String finalResult = "";
        int j = 0;
        int i = 0;
        while (i <= onlyTxt.size() - 1) {
            if (j < take.size()) {
                for (int k = i; k < take.get(j) + i; k++) {
                    if (k <= onlyTxt.size() - 1) {
                        finalResult += onlyTxt.get(k);
                    }
                }
                i += take.get(j) + skip.get(j);
                j++;
            } else {
                break;
            }
        }

        System.out.println(finalResult.trim());
    }


    private static boolean isInteger (char character) {
        try {
            Integer.parseInt(String.valueOf(character));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
