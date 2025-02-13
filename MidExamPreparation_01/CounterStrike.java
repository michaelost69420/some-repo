package MidExamPreparation_01;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        · On the first line, you will receive initial energy – an integer [1-10000].
        · On the following lines, you will be receiving the distance of an enemy – an integer [1-10000]
         */
        //1. we will start by getting the starter energy that our character gets to get to an enemy
        int initialEnergy = Integer.parseInt(sc.nextLine());

        //2. we loop while our input isn't equal to "End of battle"
        int wins = 0;
        String input;
        while (!(input = sc.nextLine()).equals("End of battle")) {
            int energyTaken = Integer.parseInt(input);

            //3. we calculate if we had enough energy to reach the enemy and if so we get a win but if not we print the wins to the console
            if (energyTaken <= initialEnergy) {
                initialEnergy -= energyTaken;
                wins++;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins, initialEnergy);
                return;
            }

            //4.we add energy to the count of the wins if they are dividable to 3
            if (wins % 3 == 0) {
                initialEnergy += wins;
            }
        }
        //5.ones we have typed the following command we stop the program and print a result
        System.out.printf("Won battles: %d. Energy left: %d", wins, initialEnergy);
    }
}
