package main.java.home.netology.abstract_interface.buttons.variant2;


public class Main {
    public static void main(String[] args) {

        Button tvButton = new Button(new TVEventHandler());

        Button printButton = new Button(new PrinterEventHandler());

        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}
