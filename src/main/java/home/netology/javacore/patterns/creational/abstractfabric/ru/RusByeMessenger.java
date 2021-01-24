package home.netology.javacore.patterns.creational.abstractfabric.ru;

import home.netology.javacore.patterns.creational.abstractfabric.ByeMessenger;

public class RusByeMessenger implements ByeMessenger {
    @Override
    public void bye(String user) {
        System.out.println("До свидания! ".concat(user));
    }
}
