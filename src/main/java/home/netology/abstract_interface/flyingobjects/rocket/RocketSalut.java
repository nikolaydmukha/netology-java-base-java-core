package main.java.home.netology.abstract_interface.flyingobjects.rocket;

import main.java.home.netology.abstract_interface.flyingobjects.interfaces.VerticalTakeoff;

public class RocketSalut extends Rocket implements VerticalTakeoff {

    private String model;
    private int currentFuelVolume;

    public RocketSalut(String model) {
        this.model = model;
        this.tankerVolume = 5000;
        this.currentFuelVolume = 0;
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
    public void startVerticalTakeoff() {
        System.out.println("Ракета " + this.model + " взлетает вертикально вверх с помощью двигателя снизу");
    }

    @Override
    public void showTakeOffType() {
        startVerticalTakeoff();
    }
}
