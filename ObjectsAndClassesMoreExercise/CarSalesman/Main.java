package ObjectsAndClassesMoreExercise.CarSalesman;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = Integer.parseInt(sc.nextLine());
//
//        List<Engine> engines = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            String[] command = sc.nextLine().split(" ");
//
//            if (command.length == 4) {
//                engines.add(new Engine(command[0], Integer.parseInt(command[1]), Integer.parseInt(command[2]), command[3]));
//            } else if (command.length == 3) {
//                if (isString(command[command.length - 1])) {
//                    engines.add(new Engine(command[0], Integer.parseInt(command[1]), command[2]));
//                } else {
//                    engines.add(new Engine(command[0], Integer.parseInt(command[1]), Integer.parseInt(command[2])));
//                }
//            } else {
//                engines.add(new Engine(command[0], Integer.parseInt(command[1])));
//            }
//        }
//
//        int m = Integer.parseInt(sc.nextLine());
//
//        List<Car> cars = new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            String[] command = sc.nextLine().split(" ");
//
//            if (command.length == 4) {
//                cars.add(new Car(command[0], command[1], Integer.parseInt(command[2]), command[3]));
//            } else if (command.length == 3) {
//                if (isString(command[command.length - 1])) {
//                    cars.add(new Car(command[0], command[1], command[2]));
//                } else {
//                    cars.add(new Car(command[0], command[1], Integer.parseInt(command[2])));
//                }
//            } else {
//                cars.add(new Car(command[0], command[1]));
//            }
//        }
//
//        for (Car car : cars) {
//            for (Engine engine : engines) {
//                if (car.getEngine().equals(engine.getModel())) {
//                    if (car.getWeight() == -1 && engine.getDisplacement() == -1) {
//                        System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: n/a%n    Efficiency: %s%n  Weight: n/a%n  Color: %s%n", car.getModel(), car.getEngine(), engine.getPower(), engine.getEfficiency(), car.getColor());
//                    } else if (car.getWeight() == -1) {
//                        System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: %d%n    Efficiency: %s%n  Weight: n/a%n  Color: %s%n", car.getModel(), car.getEngine(), engine.getPower(), engine.getDisplacement(),  engine.getEfficiency(), car.getColor());
//                    } else if (engine.getDisplacement() == -1) {
//                        System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: n/a%n    Efficiency: %s%n  Weight: %d%n  Color: %s%n", car.getModel(), car.getEngine(), engine.getPower(), engine.getEfficiency(), car.getWeight(), car.getColor());
//                    } else {
//                        System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: %d%n    Efficiency: %s%n  Weight: %d%n  Color: %s%n", car.getModel(), car.getEngine(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), car.getWeight(), car.getColor());
//                    }
//                    break;
//                }
//            }
//        }
//
//
//    }
//
//    private static boolean isString (String input) {
//        try {
//            Integer.parseInt(input);
//            return false;
//        } catch (Exception e) {
//            return true;
//        }
//    }
//}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Engine> modelToEngine = new HashMap<>();

        // V4-33 -> (V4-33 140 28 B)

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");

            if (command.length == 4) {
                Engine newEngine = new Engine(command[0], Integer.parseInt(command[1]), Integer.parseInt(command[2]), command[3]);

                modelToEngine.put(command[0], newEngine);
            } else if (command.length == 3) {
                if (isString(command[command.length - 1])) {
                    Engine newEngine = new Engine(command[0], Integer.parseInt(command[1]), command[2]);

                    modelToEngine.put(command[0], newEngine);
                } else {
                    Engine newEngine = new Engine(command[0], Integer.parseInt(command[1]), Integer.parseInt(command[2]));

                    modelToEngine.put(command[0], newEngine);
                    // pak
                }
            } else {
                Engine newEngine = new Engine(command[0], Integer.parseInt(command[1]));

                modelToEngine.put(command[0], newEngine);
                // pak
            }
        }

        int m = Integer.parseInt(sc.nextLine());

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] command = sc.nextLine().split(" ");

            if (command.length == 4) {
                cars.add(new Car(command[0], modelToEngine.get(command[1]), Integer.parseInt(command[2]), command[3]));
            } else if (command.length == 3) {
                if (isString(command[command.length - 1])) {
                    cars.add(new Car(command[0], modelToEngine.get(command[1]), command[2]));
                } else {
                    // opravi
                    cars.add(new Car(command[0], modelToEngine.get(command[1]), Integer.parseInt(command[2])));
                }
            } else {
                // opravi
                cars.add(new Car(command[0], modelToEngine.get(command[1])));
            }
        }

        // for (Car car : cars) {
        //     for (Engine engine : engines) {
        //         if (car.getEngine().equals(engine.getModel())) {
        //             if (car.getWeight() == -1 && engine.getDisplacement() == -1) {
        //                 System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: n/a%n    Efficiency: %s%n  Weight: n/a%n  Color: %s%n", car.getModel(), car.getEngine(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), car.getColor());
        //             } else if (car.getWeight() == -1) {
        //                 System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: %d%n    Efficiency: %s%n  Weight: n/a%n  Color: %s%n", car.getModel(), car.getEngine(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), car.getColor());
        //             } else if (engine.getDisplacement() == -1) {
        //                 System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: n/a%n    Efficiency: %s%n  Weight: %d%n  Color: %s%n", car.getModel(), car.getEngine(), engine.getPower(), engine.getEfficiency(), car.getWeight(), car.getColor());
        //             } else {
        //                 System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: %d%n    Efficiency: %s%n  Weight: %d%n  Color: %s%n", car.getModel(), car.getEngine(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), car.getWeight(), car.getColor());
        //             }
        //             break;
        //         }
        //     }
        // }

        for (Car car : cars) {
            Engine engine = car.getEngine();

            if (car.getWeight() == -1 && engine.getDisplacement() == -1) {
                System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: n/a%n    Efficiency: %s%n  Weight: n/a%n  Color: %s%n", car.getModel(), car.getEngine().getModel(), engine.getPower(), engine.getEfficiency(), car.getColor());
            } else if (car.getWeight() == -1) {
                System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: %d%n    Efficiency: %s%n  Weight: n/a%n  Color: %s%n", car.getModel(), car.getEngine().getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), car.getColor());
            } else if (engine.getDisplacement() == -1) {
                System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: n/a%n    Efficiency: %s%n  Weight: %d%n  Color: %s%n", car.getModel(), car.getEngine().getModel(), engine.getPower(), engine.getEfficiency(), car.getWeight(), car.getColor());
            } else {
                System.out.printf("%s:%n  %s:%n    Power: %d%n    Displacement: %d%n    Efficiency: %s%n  Weight: %d%n  Color: %s%n", car.getModel(), car.getEngine().getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), car.getWeight(), car.getColor());
            }
        }
    }

    private static boolean isString (String input) {
        try {
            Integer.parseInt(input);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
}

