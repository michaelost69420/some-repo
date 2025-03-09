package MapsLambdaandStreamAPIExercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isLegendary = false;

        LinkedHashMap<String, Integer> collectionOfItems = new LinkedHashMap<>();
        collectionOfItems.put("shards", 0);
        collectionOfItems.put("fragments", 0);
        collectionOfItems.put("motes", 0);
        //За начало ще проверяваме с безкраен цикъл като тои може да бъде спрян по опр. условие
        while (!isLegendary) {
            //На конзолата потребителя ще напише стринг които ще бъде изрязън на малки парчета и ще
            //бъде направен да бъде само с малки букви
            String[] input = sc.nextLine().toLowerCase().split(" ");

            //С фор цикъла ще преминем през всеки един елемент в масива които създадахме
            label:
            for (int i = 0; i < input.length; i += 2) {
                int currentQuantity = Integer.parseInt(input[i]);
                String material = input[i + 1];

                //Тука проверявам ако вече имам такъв предмет в мапа или не и ако вече е там ще сумирам currentQuantity с
                //quantity което е куантитито което е на вече съществуващия елемент и ако не е просто го добавям в мапа
                if (collectionOfItems.containsKey(material)) {
                    int quantity = collectionOfItems.get(material);
                    collectionOfItems.put(material, quantity + currentQuantity);
                } else {
                    collectionOfItems.put(material, currentQuantity);
                }

                //Проверявам ако имам елемент които е >= 250 и ако имам такъв излизвам от цикъла
                if (collectionOfItems.get(material) >= 250) {
                    switch (material) {
                        case "fragments":
                            System.out.println("Valanyr obtained!");
                            collectionOfItems.put(material, collectionOfItems.get(material) - 250);
                            isLegendary = true;
                            break label;
                        case "shards":
                            System.out.println("Shadowmourne obtained!");
                            collectionOfItems.put(material, collectionOfItems.get(material) - 250);
                            isLegendary = true;
                            break label;
                        case "motes":
                            System.out.println("Dragonwrath obtained!");
                            collectionOfItems.put(material, collectionOfItems.get(material) - 250);
                            isLegendary = true;
                            break label;
                    }
                }
            }
        }

        //Накрая ще принтирам всички ентриСетове от мапа ми
        collectionOfItems.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
