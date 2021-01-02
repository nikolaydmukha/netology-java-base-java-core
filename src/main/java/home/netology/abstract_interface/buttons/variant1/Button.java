package main.java.home.netology.abstract_interface.buttons.variant1;

public class Button {
    EventHandler eventHandler;

    public Button(EventHandler action) {
        this.eventHandler = action;
    }
    public void click(){
        eventHandler.execute();
    }
}
