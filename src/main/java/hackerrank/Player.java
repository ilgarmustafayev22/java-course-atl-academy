package hackerrank;

public final class Player {
    public final int score;
    public final String name;

    public Player(int score, String name) {
        this.score = score;
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("Player{score=%d, name='%s'}", score, name);
    }
}
