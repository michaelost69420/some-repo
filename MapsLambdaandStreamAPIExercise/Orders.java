package MapsLambdaandStreamAPIExercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Първо ще вземем променлива аитъм от конзолата
        String item = sc.nextLine();


        LinkedHashMap<String, Integer> itemsQuantity = new LinkedHashMap<>();
        LinkedHashMap<String, Double> itemsPrice = new LinkedHashMap<>();
        //След това ще ползваме лаил цикъл за да може да взимаме цена и куантити на продукта докато не получим опр. команда
        while (!item.equals("buy")) {
            String[] input = item.split(" ");

            //Ще проверим дали вече имаме такъв продукт или не и ако имаме в мапа тогава ще им съберем куантититата
            //и ще добавим нова цена ако не просто си ги добавяме като нови
            itemsPrice.put(input[0], Double.parseDouble(input[1]));
            if (itemsQuantity.containsKey(input[0])) {
                int currentQuantity = itemsQuantity.get(input[0]);
                itemsQuantity.put(input[0], currentQuantity + Integer.parseInt(input[2]));
            } else {
                itemsQuantity.put(input[0], Integer.parseInt(input[2]));
            }

            item = sc.nextLine();
        }

        //След като сме готови с лаил цикъла ще добавим общите цени в един друг мап
        LinkedHashMap<String, Double> finalPrices = new LinkedHashMap<>();
        for (Map.Entry<String, Double> stringDoubleEntry : itemsPrice.entrySet()) {
            finalPrices.put(stringDoubleEntry.getKey(), itemsQuantity.get(stringDoubleEntry.getKey()) * itemsPrice.get(stringDoubleEntry.getKey()));
        }

        //Накрая принтираме резултатите на конзолата
        finalPrices.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));
    }
}
