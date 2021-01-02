package main.java.home.netology.enumcustom;

public enum Teams {
    SPARTAK(6, 4, 0, 2),
    BARCELONA(6, 6, 0, 0),
    REAL(6, 4, 2, 0),
    CHELSEA(6, 3, 2, 1);

    private int games;
    private int wins;
    private int loose;
    private int draw;

    Teams (int games, int wins, int loose, int draw) {
        this.games = games;
        this.wins = wins;
        this.loose = loose;
        this.draw = draw;
    }
    public int getGames() {
        return games;
    }

    public int getWins() {
        return wins;
    }

    public int getLoose() {
        return loose;
    }

    public int getDraw() {
        return draw;
    }
}
