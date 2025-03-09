package ObjectsAndClassesMoreExercise.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");

            cars.add(new Car(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3]), input[4], Double.parseDouble(input[5]), Integer.parseInt(input[6]),
                    Double.parseDouble(input[7]), Integer.parseInt(input[8]), Double.parseDouble(input[9]), Integer.parseInt(input[10]),
                    Double.parseDouble(input[11]), Integer.parseInt(input[12])));
        }

        String command = sc.nextLine();

        if (command.equals("fragile")) {
            for (Car car : cars) {
                if ((car.getTier1pressure() < 1 || car.getTier2pressure() < 1 || car.getTier3pressure() < 1 || car.getTier4pressure() < 1) && car.getCargoType().equals(command)) {
                    System.out.println(car.getModel());
                }
            }
        } else {
            for (Car car : cars) {
                if (car.getEnginePower() > 250 && car.getCargoType().equals(command)) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
