package home.netology.javacore.patterns.creational.singletontask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;

    private int num;

    public void log(String msg) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy ");
        System.out.println("[" + LocalDateTime.now().format(formatter) + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
