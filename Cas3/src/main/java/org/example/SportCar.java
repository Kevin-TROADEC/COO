package org.example;

import org.example.interfaces.Car;

public class SportCar implements Car {

    private final boolean spoiler;

    private final boolean turbo;

    public SportCar(boolean spoiler, boolean turbo){
        this.spoiler = spoiler;
        this.turbo = turbo;
    }


    @Override
    public String display() {
        return "Sport Car\t - Spoiler " + spoiler + "\t - Turbo : " + turbo;
    }
}
