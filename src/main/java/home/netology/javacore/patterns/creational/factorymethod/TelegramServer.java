package home.netology.javacore.patterns.creational.factorymethod;

public class TelegramServer extends AbstractServer{
    @Override
    protected ILog getLog() {
        return new TelegramLog();
    }
}
