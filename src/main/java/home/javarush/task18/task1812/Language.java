package main.java.home.javarush.task18.task1812;

public class Language implements Comparable<Language>{
    private String name;
    private Double ranking;

    public Language(String name, Double ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public Double getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Язык программирования - " + name + ", рейтинг  - " + ranking + "% опрошенных.";
    }


    @Override
    public int compareTo(Language o) {
        if (this.ranking > o.getRanking()){
            return -1;
        }else if (this.ranking < o.getRanking()) {
            return 1;
        }else {
            return 0;
        }
    }
}
