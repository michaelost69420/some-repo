package MapsLambdaandStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //За начало ще вземем първоначалните материали
        String material = sc.nextLine();

        LinkedHashMap<String, Integer> collectionOfMiner = new LinkedHashMap<>();
        //С помоща на лаил цикъла можем да взимаме нужните инути докато не получим "stop"
        while (!material.equals("stop")) {
            int quantity = Integer.parseInt(sc.nextLine());

            //проверяваме първо дали материала които се искат да се добавят съществуват и ако не
            //ще съберем куанититито на съществуващия материал с новото куантити
            if (collectionOfMiner.containsKey(material)) {
                int currentQuantity = collectionOfMiner.get(material);
                collectionOfMiner.put(material, currentQuantity + quantity);
            } else {
                collectionOfMiner.put(material, quantity);
            }


            material = sc.nextLine();
        }

        //Накрая с помоща на API Streams принтираме резултатът на конзолата
        collectionOfMiner.forEach((k, o) -> System.out.println(k + " -> " + o));
    }
}
