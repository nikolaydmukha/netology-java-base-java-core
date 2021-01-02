package main.java.home.netology.abstract_interface.buttons.variant1;

public class Main {
    public static void main(String[] args) {

        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();
    }
}
