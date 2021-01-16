package home.netology.javabase.abstract_interface.buttons.variant1;

public class ButtonClickHandler implements EventHandler{
    @Override
    public void execute() {
        System.out.println("Кнопка нажата!");
    }
}
