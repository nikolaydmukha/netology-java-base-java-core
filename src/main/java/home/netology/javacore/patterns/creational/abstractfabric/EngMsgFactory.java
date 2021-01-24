package home.netology.javacore.patterns.creational.abstractfabric;
import home.netology.javacore.patterns.creational.abstractfabric.eng.*;

public class EngMsgFactory implements MsgFactory {
    @Override
    public ErrorMessenger createErrorMessenger() {
        return new EngErrorMessenger();
    }

    @Override
    public ByeMessenger createByeMessenger() {
        return new EngByeMessenger();
    }
}
