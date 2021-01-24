package home.netology.javacore.patterns.creational.abstractfabric;

import home.netology.javacore.patterns.creational.abstractfabric.ru.RusByeMessenger;
import home.netology.javacore.patterns.creational.abstractfabric.ru.RusErrorMessenger;

public class RusMsgFactory implements MsgFactory{
    @Override
    public ErrorMessenger createErrorMessenger() {
        return new RusErrorMessenger();
    }

    @Override
    public ByeMessenger createByeMessenger() {
        return new RusByeMessenger();
    }
}
