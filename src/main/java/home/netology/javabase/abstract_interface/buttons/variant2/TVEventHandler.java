package home.netology.javabase.abstract_interface.buttons.variant2;

public class TVEventHandler implements EventHandler {
    private boolean on = false;

    public void execute() {

        if (on) {
            System.out.println("Телевизор выключен..");
            on = false;
        } else {
            System.out.println("Телевизор включен!");
            on = true;
        }
    }
}
