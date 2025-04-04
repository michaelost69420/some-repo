package ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String places = sc.nextLine();

        Pattern pattern = Pattern.compile("([=\\/])[A-Z][A-Za-z]{2,}\\1");
        Matcher matcher = pattern.matcher(places);

        List<String> placeList = new ArrayList<>();
        while (matcher.find()) {
            placeList.add(matcher.group().replace("/", "").replace("=", ""));
        }

        System.out.println("Destinations: " + String.join(", " , placeList));
        int sum = 0;
        for (String string : placeList) {
            sum += string.length();
        }

        System.out.printf("Travel Points: %d", sum);
    }
}
