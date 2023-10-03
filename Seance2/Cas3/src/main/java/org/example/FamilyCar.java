package org.example;

import org.example.interfaces.Car;

public class FamilyCar implements Car {

    public final boolean childSeat;
    public final boolean lockBackDoor;

    public FamilyCar(boolean childSeat, boolean lockBackDoor){
        this.childSeat = childSeat;
        this.lockBackDoor = lockBackDoor;
    }


    @Override
    public String display() {
        return "Family Car\t - Child Seat : " + childSeat + "\t - Back Door Locked : " + lockBackDoor;
    }
}
