package ObjectsAndClassesLab.Songs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Song> information = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] info = sc.nextLine().split("_");

            information.add(new Song(info[0], info[1], info[2]));
        }

        String type = sc.nextLine();

        if (type.equals("all")) {
            for (Song song : information) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : information) {
                if (type.equals(song.getTypeList())) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
