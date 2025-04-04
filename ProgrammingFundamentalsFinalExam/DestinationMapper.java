package ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Pattern pattern = Pattern.compile("([=\\/])(?<Destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(str);

        List<String> destinations = new ArrayList<>();
        int sum = 0;
        while (matcher.find()) {
            String currentMatch = matcher.group("Destination");
            destinations.add(currentMatch);
            sum += currentMatch.length();
        }

        System.out.println("Destinations: " + String.join(", " , destinations));
        System.out.println("Travel Points: " + sum);
    }
}
