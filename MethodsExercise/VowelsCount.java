package MethodsExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class VowelsCount {

    private static int vowelsAmount (String txt) {

        String txt1 = txt.toLowerCase();

        int count = 0;

        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('o');
        vowels.add('u');
        vowels.add('i');
        vowels.add('e');

        for (int i = 0; i < txt1.length(); i++) {
            if (vowels.contains(txt1.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(vowelsAmount(sc.nextLine()));
    }
}
