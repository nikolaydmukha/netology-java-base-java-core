package home.netology.javacore.generics.sinmpletasks;

public class Main {
    public static void main(String[] args) {
        //SmallBox
        // параметризуем класс типом String
        SmallBox<String> sample1 = new SmallBox<>("Нетология");
        System.out.println(sample1);

        // параметризуем класс типом Integer
        SmallBox<Integer> sample2 = new SmallBox<>(1);
        System.out.println(sample2);

        // параметризуем класс типом Boolean
        SmallBox<Boolean> sample3 = new SmallBox<>(Boolean.TRUE);
        System.out.println(sample3);

        //BigBox
        // параметризуем класс типом String для ключа и значения
        BigBox<String, String> sample4 = new BigBox<>("имя", "Нетология");
        System.out.println(sample4);
        // параметризуем класс типом Integer для ключа и Boolean для значения
        BigBox<Integer, Boolean> sample5 = new BigBox<>(1, Boolean.TRUE);
        System.out.println(sample5);
    }
}
