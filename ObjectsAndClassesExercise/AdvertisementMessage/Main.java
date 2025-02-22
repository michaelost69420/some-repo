package ObjectsAndClassesExercise.AdvertisementMessage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AdvertisementWords advertisementWords = new AdvertisementWords();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            advertisementWords.setPhrases(RandomPhrasesGenerator());
            advertisementWords.setEvents(RandomEventsGenerator());
            advertisementWords.setAuthors(RandomAuthorsGenerator());
            advertisementWords.setCities(RandomCitiesGenerator());

            System.out.println(advertisementWords.getPhrases() + " " + advertisementWords.getEvents() + " " + advertisementWords.getAuthors() + " - " + advertisementWords.getCities());
        }
    }

    private static String RandomPhrasesGenerator () {
        Random random = new Random();
        int number = random.nextInt(6);

        String txt = "";
        switch (number) {
            case 0 -> txt = "Excellent product.";
            case 1 -> txt = "Such a great product.";
            case 2 -> txt = "I always use that product.";
            case 3 -> txt = "Best product of its category.";
            case 4 -> txt = "Exceptional product.";
            case 5 -> txt = "I can’t live without this product.";
        }
        return txt;
    }

    private static String RandomEventsGenerator () {
        Random random = new Random();
        int number = random.nextInt(6);

        String txt = "";
        switch (number) {
            case 0 -> txt = "Now I feel good.";
            case 1 -> txt = "I have succeeded with this product.";
            case 2 -> txt = "Makes miracles. I am happy of the results!";
            case 3 -> txt = "I cannot believe but now I feel awesome.";
            case 4 -> txt = "Try it yourself, I am very satisfied.";
            case 5 -> txt = "I feel great!";

        }
        return txt;
    }

    private static String RandomAuthorsGenerator () {
        Random random = new Random();
        int number = random.nextInt(8);

        String txt = "";
        switch (number) {
            case 0 -> txt = "Diana";
            case 1 -> txt = "Petya";
            case 2 -> txt = "Stella";
            case 3 -> txt = "Elena";
            case 4 -> txt = "Katya";
            case 5 -> txt = "Iva";
            case 6 -> txt = "Annie";
            case 7 -> txt = "Eva";
        }
        return txt;
    }


    private static String RandomCitiesGenerator () {
        Random random = new Random();
        int number = random.nextInt(5);

        String txt = "";
        switch (number) {
            case 0 -> txt = "Burgas";
            case 1 -> txt = "Sofia";
            case 2 -> txt = "Plovdiv";
            case 3 -> txt = "Varna";
            case 4 -> txt = "Ruse";
        }
        return txt;
    }

}
