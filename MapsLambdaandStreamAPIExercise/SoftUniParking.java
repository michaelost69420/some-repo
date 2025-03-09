package MapsLambdaandStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Първо ще вземем бройката пъти в които ще взимаме опр. команда с помоща на фор цикъл
        int n = Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, String> personsInfo = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            //Взимаме стринга от конзолата и го разделяме на парчета
            String[] input = sc.nextLine().split(" ");

            //С слуич стеитмента кода е по разбираем кое за какво е отнася
            switch (input[0]) {
                case "register" -> {
                    //С помоща на иф стеитмента може да проверим дали узър се опитва да влезе с разлицен лаисъснПлеит
                    if (personsInfo.containsKey(input[1])) {
                        System.out.printf("ERROR: already registered with plate number %s%n", input[2]);
                    } else {
                        personsInfo.put(input[1], input[2]);
                        System.out.printf("%s registered %s successfully%n", input[1], input[2]);
                    }
                }
                case "unregister" -> {
                    //Тук обаче ще проверяваме дали имаме такъв юзър в мапа преди да го махнем
                    if (!personsInfo.containsKey(input[1])) {
                        System.out.printf("ERROR: user %s not found%n", input[1]);
                    } else {
                        personsInfo.remove(input[1]);
                        System.out.printf("%s unregistered successfully%n", input[1]);
                    }
                }
            }
        }

        //Накрая принтираме целия мап на конзолата
        personsInfo.forEach((k, v) -> System.out.printf("%s => %s%n", k ,v));
    }
}
