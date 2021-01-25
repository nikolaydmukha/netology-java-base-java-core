package home.netology.javacore.patterns.creational.factorymethod;

public class TelegramLog implements ILog{

    @Override
    public void log(String message) {
        System.out.println("Telegram Log");
    }
}
