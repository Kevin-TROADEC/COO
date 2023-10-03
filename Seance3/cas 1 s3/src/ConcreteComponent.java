import Interfaces.Component;

public class ConcreteComponent implements Component {
    protected double price;
    protected String name;


    public String getName() {
        return name;
    }
    ConcreteComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        System.out.println(this.name + " : " + this.price + "€");
        return this.price;
    }
}
