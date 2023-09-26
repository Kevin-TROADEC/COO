package org.example;

public final class Make {

    private static Make instance;
    public String value;

    private Make(String value) {
        this.value = value;
    }

    public static Make getMake(String value){
        if (instance == null) {
            instance = new Make(value);
        }
        return Make.instance;
    }


    public static Make getMake(){

        if (instance == null) {
            instance = new Make("default");
        }
        return Make.instance;
    }
}
