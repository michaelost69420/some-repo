package ObjectsAndClassesMoreExercise.TeamworkProjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();

        List<String> members = new ArrayList<>();
        List<String> owners = new ArrayList<>();
        List<String> teamsInOrder = new ArrayList<>();
        int count1 = 0;
        while (!input.equals("end of assignment")) {

            if (count1 == n) {
                break;
            }

            String[] command;
            if (input.contains("->")) {
                command = input.split("->");

                if (!teamsInOrder.contains(command[1])) {
                    System.out.printf("Team %s does not exist!%n", command[1]);
                } else if (members.contains(command[0]) || owners.contains(command[0])) {
                    System.out.printf("Member %s cannot join team %s!%n", command[0], command[1]);
                } else {
                    count1++;
                    members.add(command[0]);
                    teamsInOrder.add(command[1]);
                }
            } else if (input.contains("-")) {
                command = input.split("-");

                if (teamsInOrder.contains(command[1])) {
                    System.out.printf("Team %s was already created!%n", command[1]);
                } else if (owners.contains(command[0])) {
                    System.out.printf("%s cannot create another team!%n", command[0]);
                } else {
                    System.out.printf("Team %s has been created by %s!%n", command[1], command[0]);
                    members.add(command[0]);
                    owners.add(command[0]);
                    teamsInOrder.add(command[1]);
                }

            }


            input = sc.nextLine();
        }

        List<List<String>> result = new ArrayList<>();
        List<String> disbandTeams = new ArrayList<>();
        List<String> teamMembers = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < members.size(); i++) {
            if (count <= owners.size() - 1) {
                teamMembers.add(teamsInOrder.get(i));
                teamMembers.add("- " + owners.get(count));
            } else {
                break;
            }
            for (int j = i + 1; j < members.size(); j++) {
                if (Objects.equals(teamsInOrder.get(j), teamsInOrder.get(i))) {
                    teamMembers.add("-- " + members.get(j));
                }
            }
            if (teamMembers.size() == 2) {
                disbandTeams.add(teamsInOrder.get(i));
                teamMembers.clear();
            } else {
                result.add(new ArrayList<>(teamMembers));
                teamMembers.clear();
            }
            count++;
        }

        result.sort(Comparator.comparing(List::getFirst));

        for (List<String> strings : result) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
        System.out.println("Teams to disband:");
        disbandTeams.forEach(System.out::println);
    }
}

