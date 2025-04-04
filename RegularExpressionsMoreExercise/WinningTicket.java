package RegularExpressionsMoreExercise;

import java.util.*;
import java.util.regex.*;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tickets = sc.nextLine().split(",\\s+");

        Pattern pattern = Pattern.compile("[\\x21-\\x7D]{20}");
        Pattern pattern1 = Pattern.compile("(?=([$#^@]{6,10}))");
        for (String ticket : tickets) {
            Matcher matcher = pattern.matcher(ticket);

            if (matcher.find()) {
                Matcher matcher1 = pattern1.matcher(ticket);
                if (matcher1.find()) {
                    StringBuilder currentString = new StringBuilder();
                    while (matcher1.find()) {
                        String str = matcher1.group(1);
                        for (int i = 0; i <= str.length() - 1; i++) {
                            if (i == str.length() - 1) {
                                currentString.append(str.charAt(i));
                                currentString.append(", ");
                                break;
                            }
                            currentString.append(str.charAt(i));
                            if (str.charAt(i) != str.charAt(i + 1)) {
                                currentString.append(", ");
                                break;
                            }
                        }
                    }
                    Matcher matcher2 = pattern1.matcher(currentString.toString());
                    List<String> list = new ArrayList<>();
                    if (matcher2.find()) {
                        while (matcher2.find()) {
                            list.add(matcher2.group(1));
                        }

                        if (list.getFirst().equals(list.get(1))) {
                            if (list.getFirst().length() == 10) {
                                System.out.printf("ticket \"%s\" - 10%c Jackpot!%n", matcher.group(), list.getFirst().charAt(0));
                            } else {
                                System.out.printf("ticket \"%s\" - %d%c%n", matcher.group(), list.getFirst().length(), list.getFirst().charAt(0));
                            }
                        } else {
                            System.out.printf("ticket \"%s\" - no match%n", matcher.group());
                        }
                    }

                } else {
                    System.out.printf("ticket \"%s\" - no match%n", matcher.group());
                }
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}
