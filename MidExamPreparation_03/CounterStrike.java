package MidExamPreparation_03;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.we get an energy u start with
        int starterEnergy = Integer.parseInt(sc.nextLine());

        int wins = 0;
        String input;
        while (!(input = sc.nextLine()).equals("End of battle")) {

            //2.we check if our energy is enough to reach an enemy and if not that we print a sertant text
            if (starterEnergy < Integer.parseInt(input)) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins, starterEnergy);
                return;
            } else {
                starterEnergy -= Integer.parseInt(input);
                wins++;
            }

            //3.we check if our wins are dividable by 3
            if (wins % 3 == 0) {
                starterEnergy += wins;
            }
        }

        //4.ones we recieve the command "End of battle"
        System.out.printf("Won battles: %d. Energy left: %d", wins, starterEnergy);
    }
}
