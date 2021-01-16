package home.netology.javabase.abstract_interface.flyingobjects.aircraft;

import home.netology.javabase.abstract_interface.flyingobjects.interfaces.HorizontalTakeoff;

public class Boeing777 extends AirCraft implements HorizontalTakeoff {

    private String model;
    private int currentFuelVolume;

    public Boeing777(String model) {
        this.model = model;
        this.tankerVolume = 3000;
        this.currentFuelVolume = 1000;
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
        System.out.println("Boeing777, 2015 г.в., США");
    }

    //Interface methods
    @Override
    public void showTakeOffType() {
        startHorizontalTakeoff();
    }

    @Override
    public void startHorizontalTakeoff() {
        System.out.println("Воздушное судно " + this.model + " взлетает горизонтально под действием скорости и потоков воздуха.");
    }
}
