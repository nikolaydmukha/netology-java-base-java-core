package main.java.home.netology.abstract_interface.buttons.variant2;


public class Button {
    EventHandler eventHandler;

    public Button(EventHandler action) {
        this.eventHandler = action;
    }

    public void click() {
        eventHandler.execute();
    }
}
