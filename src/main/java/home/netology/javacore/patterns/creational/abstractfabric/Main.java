package home.netology.javacore.patterns.creational.abstractfabric;

public class Main {
    public static void main(String[] args) {
        MsgFactory rus = new RusMsgFactory();
        MsgFactory eng = new EngMsgFactory();

        ByeMessenger byeRus = rus.createByeMessenger();
        ByeMessenger byeEng = eng.createByeMessenger();

        ErrorMessenger errorRus = rus.createErrorMessenger();
        ErrorMessenger errorEng = eng.createErrorMessenger();

        byeEng.bye("Nick");
        errorEng.print(404);

        byeRus.bye("Nick");
        errorRus.print(404);

    }
}
