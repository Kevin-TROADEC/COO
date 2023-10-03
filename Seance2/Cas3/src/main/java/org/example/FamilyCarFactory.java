package org.example;

import org.example.interfaces.Car;

public class FamilyCarFactory extends BaseFactory{


    @Override
    public FamilyCar createCar(boolean childSeat, boolean lockBackDoor) {
        return new FamilyCar(childSeat, lockBackDoor);
    }
}
