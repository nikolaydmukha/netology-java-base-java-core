package main.java.home.javarush.task1105;
/*
В классе Window есть метод changeSize, который должен менять размеры окна на значения, переданные в метод.
Но если ты запустишь программу, то убедишься, что этот метод не работает. Тебе нужно исправить ошибки так, чтобы метод заработал.
Требования:
    Объявление и инициализацию полей класса Window изменять нельзя.
    Метод changeSize класса Window должен изменять значения полей класса согласно переданным данным.
    Объявление метода changeSize и названия параметров изменять нельзя
 */
public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
