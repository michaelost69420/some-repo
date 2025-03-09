package MapsLambdaandStreamAPIExercise;
import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> sidesMap = new LinkedHashMap<>();
        Map<String, String> usersMap = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Lumpawaroo")) {
            if (input.contains(" | ")) {

                String[] cmd = input.split(" \\| ");
                String side = cmd[0];
                String user = cmd[1];

                if (!usersMap.containsKey(user)) {

                    sidesMap.putIfAbsent(side, new ArrayList<>());
                    sidesMap.get(side).add(user);
                    usersMap.put(user, side);
                }
            } else if (input.contains(" -> ")) {

                String[] cmd = input.split(" -> ");
                String user = cmd[0];
                String side = cmd[1];

                if (usersMap.containsKey(user)) {

                    String oldSide = usersMap.get(user);
                    sidesMap.get(oldSide).remove(user);
                }

                sidesMap.putIfAbsent(side, new ArrayList<>());
                sidesMap.get(side).add(user);
                usersMap.put(user, side);

                System.out.println(user + " joins the " + side + " side!");
            }
        }

        sidesMap
                .entrySet()
                .stream()
                .filter(pair -> !pair
                        .getValue()
                        .isEmpty())
                .forEach(pair -> {

                    System.out.println
                            ("Side: " + pair.getKey() + ", Members: " + pair.getValue().size());

                    pair.getValue().forEach(user ->
                            System.out.println("! " + user));
                });


        //Giving a shout-out to Stoyanov for the code since I couldn't write it myself
        //Thanks Stoyanov for your code, it really helped me understand the concept of the problem
    }
}