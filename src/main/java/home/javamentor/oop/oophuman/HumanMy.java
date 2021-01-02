package main.java.home.javamentor.oop.oophuman;

public class HumanMy {
    public static void main(String[] args) {
        Human humanOne = new Human();
        Human humanTwo = new Human((byte) 35, "Николай", "Дмуха", "Футбол");
        Human humanThree = new Human((byte) 35, "Николай", "Дмуха");
    }

    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {
        }

        public Human(byte age, String name, String secondName, String favoriteSport) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
        }

        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
}
