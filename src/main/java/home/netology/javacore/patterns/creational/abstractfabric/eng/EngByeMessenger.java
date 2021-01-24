package home.netology.javacore.patterns.creational.abstractfabric.eng;

import home.netology.javacore.patterns.creational.abstractfabric.ByeMessenger;

public class EngByeMessenger implements ByeMessenger {
    @Override
    public void bye(String user) {
        System.out.println("Bye-bye ".concat(user));
    }
}
