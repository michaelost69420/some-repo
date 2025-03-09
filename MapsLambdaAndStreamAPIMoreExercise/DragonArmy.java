package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<DragonStats> stats = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<String> type = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");

            if (name.contains(command[1]) && type.contains(command[0])) {
                DragonStats dragonStats = getDragonStats(stats, command[0], command[1]);

                dragonStats.setDamage(Integer.parseInt(command[2]));
                dragonStats.setHealth(Integer.parseInt(command[3]));
                dragonStats.setArmor(Integer.parseInt(command[4]));
            } else {
                type.add(command[0]);
                name.add(command[1]);
                if (command[2].equals("null") && command[3].equals("null") && command[4].equals("null")) {
                    stats.add(new DragonStats(command[0], command[1], 45, 250, 10));
                } else if (command[2].equals("null") && command[3].equals("null")) {
                    stats.add(new DragonStats(command[0], command[1], 45, 250, Integer.parseInt(command[4])));
                } else if (command[3].equals("null") && command[4].equals("null")) {
                    stats.add(new DragonStats(command[0], command[1], Integer.parseInt(command[2]), 250, 10));
                } else if (command[2].equals("null") && command[4].equals("null")) {
                    stats.add(new DragonStats(command[0], command[1], 45, Integer.parseInt(command[3]), 10));
                } else if (command[2].equals("null")) {
                    stats.add(new DragonStats(command[0], command[1], 45, Integer.parseInt(command[3]), Integer.parseInt(command[4])));
                } else if (command[3].equals("null")) {
                    stats.add(new DragonStats(command[0], command[1], Integer.parseInt(command[2]), 250, Integer.parseInt(command[4])));
                } else if (command[4].equals("null")) {
                    stats.add(new DragonStats(command[0], command[1], Integer.parseInt(command[2]), Integer.parseInt(command[3]), 10));
                } else {
                    stats.add(new DragonStats(command[0], command[1], Integer.parseInt(command[2]), Integer.parseInt(command[3]), Integer.parseInt(command[4])));
                }
            }
        }

        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;
        int count = 0;
        List<String> name1 = new ArrayList<>();
        List<String> type1 = new ArrayList<>();
        for (DragonStats stat : stats) {
            if (!type1.contains(stat.getType())) {
                String currentType = stat.getType();
                for (DragonStats dragonStats : stats) {
                    if (dragonStats.getType().equals(currentType)) {
                        sum += dragonStats.getDamage();
                        sum1 += dragonStats.getHealth();
                        sum2 += dragonStats.getArmor();
                        name1.add(dragonStats.getName());
                        count++;
                    }
                }
                System.out.printf("%s::(%.2f/%.2f/%.2f)%n", currentType, sum / count, sum1 / count, sum2 / count);
                sum = 0;
                sum1 = 0;
                sum2 = 0;
                count = 0;

                Collections.sort(name1);

                for (String currentName : name1) {
                    for (DragonStats dragonStats : stats) {
                        if (dragonStats.getType().equals(currentType) && dragonStats.getName().equals(currentName)) {
                            System.out.println("-" + dragonStats.getName() + " -> damage: " + dragonStats.getDamage() + ", health: " + dragonStats.getHealth() + ", armor: " + dragonStats.getArmor());
                        }
                    }
                }
                type1.add(stat.getType());
            }
        }
    }

    private static DragonStats getDragonStats(List<DragonStats> dragonStats, String type, String name) {
        DragonStats dragonStats1 = null;
        for (DragonStats dragonStat : dragonStats) {
            if (dragonStat.getType().equals(type) && dragonStat.getName().equals(name)) {
                dragonStats1 = dragonStat;
            }
        }
        return dragonStats1;
    }
}

class DragonStats {
    private String type;
    private String name;
    private int damage;
    private int health;
    private int armor;

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public DragonStats(String type, String name, int damage, int health, int armor) {
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}