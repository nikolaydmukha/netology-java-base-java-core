package home.netology.javabase.abstract_interface.buttons.variant2;

public class ButtonClickHandler implements EventHandler {
    @Override
    public void execute() {
        System.out.println("Кнопка нажата!");
    }
}
