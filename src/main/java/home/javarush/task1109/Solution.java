package main.java.home.javarush.task1109;
/*
В классе Outer есть внутренний (Inner) и вложенный (Nested) классы. В методе main класса Solution создай по одному
объекту каждого из них.
Требования:

    В методе main класса Solution должен быть создан объект класса Inner.
    В методе main класса Solution должен быть создан объект класса Nested.
    Класс Outer изменять нельзя.
 */
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Outer.Inner innerObject = new Outer().new Inner();
        Outer.Nested nestedObject = new Outer.Nested();
    }
}
