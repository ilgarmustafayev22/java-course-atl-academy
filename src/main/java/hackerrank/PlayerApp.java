package hackerrank;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {
    public static void main(String[] args) {
        Player[] players = {new Player(17, "Z"),
                new Player(16, "B"),
                new Player(19, "A")};
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new Checker());
        System.out.println(Arrays.toString(players));

        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return p1.score != p2.score ? Integer.compare(p2.score, p1.score) : p1.name.compareTo(p2.name);
            }
        });
        System.out.println(Arrays.toString(players));

        Arrays.sort(players,(player1,player2)->player2.name.compareTo(player1.name));
        System.out.println(Arrays.toString(players));

        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
        for (Player player : players) {
            System.out.println(player);
        }
        for (Player player : players) {
            System.out.println(player);
        }
        Arrays.stream(players).forEach(player -> System.out.println(player));
        Arrays.stream(players).forEach(System.out::println);

    }
}
