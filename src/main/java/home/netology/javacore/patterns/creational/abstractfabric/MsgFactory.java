package home.netology.javacore.patterns.creational.abstractfabric;

public interface MsgFactory {
    ErrorMessenger createErrorMessenger();
    ByeMessenger createByeMessenger();

}
