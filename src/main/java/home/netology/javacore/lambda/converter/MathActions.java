package main.java.home.netology.javacore.lambda.converter;

import java.util.Formatter;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MathActions {
    static Supplier<MathActions> instance = MathActions::new;

    UnaryOperator<Integer> increment = x -> x + 1;
    UnaryOperator<Integer> decrement = x -> x - 1;
    UnaryOperator<Integer> powOfX = x -> x * x;
    Formatter f = new Formatter();
    Function<Integer, String> toString = x -> f.format("Конвертируем число %d ", x) + " в строку " + x.toString();

    Consumer<Integer> incrementInfo = (x) -> System.out.printf("Увеличим %d на единицу. Получаем %d\n", x, increment.apply(x));
    Consumer<Integer> decrementInfo = (x) -> System.out.printf("Уменьшим %d на единицу. Получаем %d\n", x, decrement.apply(x));
    Consumer<Integer> powerInfo = (x) -> System.out.printf("Возводим %d в квадрат. Получаем %d\n", x, powOfX.apply(x));
}
