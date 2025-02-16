package MidExam;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int buscuitPerDay = Integer.parseInt(sc.nextLine());
        int countOfWorkers = Integer.parseInt(sc.nextLine());
        int amountOfCookiesInEnemyFactory = Integer.parseInt(sc.nextLine());

        int totalBuiscuitsProducedADayByEveryWorker = buscuitPerDay * countOfWorkers;

        double changeOfProduction;
        int total = 0;
        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0) {
                changeOfProduction = totalBuiscuitsProducedADayByEveryWorker * 0.75;
                total += (int) changeOfProduction;
            } else {
                total += totalBuiscuitsProducedADayByEveryWorker;
            }
        }

        double percentMore = ((double) (total - amountOfCookiesInEnemyFactory) / amountOfCookiesInEnemyFactory) * 100;
        System.out.printf("You have produced %d biscuits for the past month.%n", total);
        if (total > amountOfCookiesInEnemyFactory) {
            System.out.printf("You produce %.2f percent more biscuits.",percentMore);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(percentMore));
        }
    }
}
