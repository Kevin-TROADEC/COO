package org.example;

import org.example.interfaces.Car;

public class SportCarFactory extends BaseFactory{
    @Override
    public SportCar createCar(boolean spoiler, boolean turbo) {
        return new SportCar(spoiler, turbo);
    }
}
