package main.java.home.javarush.javaCore.task14.task1413;

public class Computer {
    private Monitor monitor = new Monitor();
    private Keyboard keyboard = new Keyboard();
    private Mouse mouse = new Mouse();

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
