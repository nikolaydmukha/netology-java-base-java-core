package home.netology.javabase.abstract_interface.flyingobjects;

import home.netology.javabase.abstract_interface.flyingobjects.aircraft.AirCraft;

public class ManageFlyingObjects {

    public void getFlyingObjectAction(FlyingObjects flyingObjects) {
        flyingObjects.fly();
    }

    public void getAircraftTakeoffType(AirCraft airCraft) {
        airCraft.showTakeOffType();
    }

    public void addFuelToTanker(FlyingObjects flyingObjects) {
        flyingObjects.addFuel();
    }

}
