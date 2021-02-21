package home.netology.javacore.multithreadingprogramming.volatiletasks.task1;

public class Switcher {
    private volatile String buttonStatus;

    public Switcher() {
        buttonStatus = "Off";
    }

    public String getButtonStatus() {
        return buttonStatus;
    }

    public void setButtonStatus(String buttonStatus) {
        this.buttonStatus = buttonStatus;
    }
}
