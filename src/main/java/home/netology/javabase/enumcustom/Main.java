package home.netology.javabase.enumcustom;

public class Main {
    public static void main(String[] args) {
        Teams spartak = Teams.SPARTAK;
        Teams barcelnoa = Teams.BARCELONA;

        System.out.println(spartak.getWins());
        System.out.println(Teams.valueOf("SPARTAK"));
        System.out.println(spartak.getWins() == barcelnoa.getWins() ? true : false );
        System.out.println(barcelnoa.getGames());

    }
}
