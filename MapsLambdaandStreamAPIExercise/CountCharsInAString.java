package MapsLambdaandStreamAPIExercise;

import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Взимаме стринг от конзолата
        String txt = sc.nextLine();

        LinkedHashMap<Character, Integer> lettersAmount = new LinkedHashMap<>();
        //Правим фор цикъл за да може да минем през всяка една буква и ако имаме " " тогава продължаваме
        char currentCharacter;
        int count = 1;
        for (int i = 0; i < txt.length(); i++) {
            //Взимам буква ,с която ще правя проверки в другия фор цикъл и ако имаме " " тогава пропущаме
            if (txt.charAt(i) != ' ') {
                currentCharacter = txt.charAt(i);
                //С втория фор цикъл търсим букви еднакви на тази която сме запазили в променливата currentCharacter
                for (int j = i + 1; j < txt.length(); j++) {
                    if (txt.charAt(j) == currentCharacter) {
                        count++;
                    }
                }
                //След цикъла добавяме финалните дани за точно тази буква но ще добавяме ако буквата не е подобна на вече
                //съществуваща.
                lettersAmount.putIfAbsent(currentCharacter, count);
                count = 1;
            }
        }

        //Накрая принтираме всички елементи в нашия мап
        lettersAmount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
