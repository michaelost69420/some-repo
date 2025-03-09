package TextProcessingMoreExercise;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        System.out.println("<h1>\n    " + title + "\n</h1>");
        String content = sc.nextLine();
        System.out.println("<article>\n    " + content + "\n</article>");

        String inputComment = sc.nextLine();

        while (!inputComment.equals("end of comments")) {
            System.out.println("<div>\n    " + inputComment + "\n</div>");

            inputComment = sc.nextLine();
        }
    }
}
