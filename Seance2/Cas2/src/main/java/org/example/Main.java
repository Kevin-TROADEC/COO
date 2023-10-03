package org.example;

public class Main {
    public static void main(String[] args) {
        Smartphone Iphone12 = new Smartphone(new Apple());
        Smartphone GalaxyS20 = new Smartphone(new Samsung());
        SimplePhone Nokia3310 = new SimplePhone(new Nokia());

        Iphone12.internet();
        GalaxyS20.camera();
        Nokia3310.call();
        Iphone12.message();

    }
}