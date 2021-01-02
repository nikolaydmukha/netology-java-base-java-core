package main.java.home.netology.abstract_interface.flyingobjects.helicopter;

import main.java.home.netology.abstract_interface.flyingobjects.interfaces.VerticalTakeoff;

public class Mi8 extends Helicopter implements VerticalTakeoff {

    private String model;
    private int currentFuelVolume;

    public Mi8(String model) {
        this.model = model;
        this.tankerVolume = 1500;
        this.currentFuelVolume = 500;
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

    @Override
    public void showInfo() {
        System.out.println("Вертолет 'Ми8', 2010 г.в., Россия");
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
