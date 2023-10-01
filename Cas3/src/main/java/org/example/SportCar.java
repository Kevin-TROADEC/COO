package org.example;

import org.example.interfaces.Car;

public class SportCar implements Car {

    private final boolean spoiler;

    private final boolean turbo;
    private Make make;

    public SportCar(boolean spoiler, boolean turbo){
        this.make = Make.getMake();
        this.spoiler = spoiler;
        this.turbo = turbo;
    }


    @Override
    public String display() {
        return "Sport Car\t - Spoiler " + spoiler + "\t - Turbo : " + turbo;
    }
}
