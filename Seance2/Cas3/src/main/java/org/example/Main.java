package org.example;

import org.example.interfaces.Car;

public class Main {
    public static void main(String[] args) {
        Make make = Make.getMake("Dacia");

        FamilyCarFactory FC = new FamilyCarFactory();
        SportCarFactory SC = new SportCarFactory();

        FamilyCar car1 = FC.createCar(true, false);
        SportCar car2 = SC.createCar(false, true);
        make = Make.getMake("Citroen");

        FC.display(make, car1);
        SC.display(make, car2);
    }
}