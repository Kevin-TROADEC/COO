package org.example;

public abstract class Application {

    public void save(){
        wrappee.save();
    }
    public abstract void print();

    public Application wrappee;
}
