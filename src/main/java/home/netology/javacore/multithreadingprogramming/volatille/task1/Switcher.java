package home.netology.javacore.multithreadingprogramming.volatille.task1;

public class Switcher {
    private volatile Boolean buttonStatus;

    public Switcher() {
        buttonStatus = true;
    }

    public Boolean getButtonStatus() {
        return buttonStatus;
    }

    public void setButtonStatus(Boolean buttonStatus) {
        this.buttonStatus = buttonStatus;
    }
}
