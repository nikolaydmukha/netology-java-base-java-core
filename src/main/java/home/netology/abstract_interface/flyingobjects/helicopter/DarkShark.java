package main.java.home.netology.abstract_interface.flyingobjects.helicopter;

import main.java.home.netology.abstract_interface.flyingobjects.interfaces.VerticalTakeoff;

public class DarkShark extends Helicopter implements VerticalTakeoff {

    private String model;
    private int currentFuelVolume;

    public DarkShark(String model) {
        this.model = model;
        this.tankerVolume = 1800;
        this.currentFuelVolume = 800;
    }

    public String getModel() {
        return model;
    }

    //Abstract methods
    @Override
    public void fly() {
        System.out.println("Летит " + this.model);
    }

    @Override
    public void addFuel() {
        if (this.currentFuelVolume < this.tankerVolume) {
            this.tankerVolume += 100;
        }
    }

    //Interface methods
    @Override
    public void showTakeOffType() {
        startVerticalTakeoff();
    }

    @Override
    public void startVerticalTakeoff() {
        System.out.println("Вертолет " + this.model + " взлетает вертикально вверх с помощью лопастей");
    }
}
