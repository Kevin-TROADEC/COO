package org.example;

import org.example.interfaces.Car;

public abstract class BaseFactory {

    public abstract Car createCar(boolean v1, boolean v2);

    public void display(Make make, Car car){
        System.out.println("make : " + make.value + "\t | car : " + car.display());
    }

}
