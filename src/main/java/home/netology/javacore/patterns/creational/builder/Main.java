package home.netology.javacore.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .withName("Анна")
                .withLastName("Вольф")
                .withAge((byte) 31)
                .withCity("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .withName("Антошка")
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().withAge((byte) -100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
