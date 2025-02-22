package ObjectsAndClassesExercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();
        int sumCar = 0;
        int sumTruck = 0;
        int carCount = 0;
        int truckCount = 0;
        while (!input.equals("End")) {
            String[] command = input.split(" ");

            if (command[0].equals("car")) {
                carCount++;
                sumCar += Integer.parseInt(command[3]);
                command[0] = "Car";
            } else {
                truckCount++;
                sumTruck += Integer.parseInt(command[3]);
                command[0] = "Truck";
            }

            vehicles.add(new Vehicle(command[0], command[1], command[2], Integer.parseInt(command[3])));

            input = sc.nextLine();
        }

        String input1 = sc.nextLine();
        while (!input1.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(input1)) {
                    System.out.println(vehicle);
                    break;
                }
            }

            input1 = sc.nextLine();
        }

        double carAvr = 1.0 * sumCar / carCount;
        double truckAvr = 1.0 * sumTruck / truckCount;
        if (sumCar != 0 && carCount != 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carAvr);
        } else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }
        if (truckCount != 0 && sumTruck != 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", truckAvr);
        } else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }

    }
}
