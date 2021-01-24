package home.netology.javacore.patterns.creational.abstractfabric.ru;

import home.netology.javacore.patterns.creational.abstractfabric.ErrorMessenger;

public class RusErrorMessenger implements ErrorMessenger {

    @Override
    public void print(int errorCode) {
        System.out.println("Случилась ошибка ".concat(String.valueOf(errorCode)));
    }
}
