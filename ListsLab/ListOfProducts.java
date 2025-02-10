package ListsLab;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        LinkedList<String> items = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            items.add(sc.nextLine());
        }

        Collections.sort(items);

        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + 1 + "." + items.get(i));
        }
    }
}
